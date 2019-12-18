package com.qwx.front.mq;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 *  报表 会员消费排行报表队列
 * @author WEN
 *
 */
@Component
public class MessageProducer implements RabbitTemplate.ConfirmCallback, RabbitTemplate.ReturnCallback {

    public static final Logger LOG = LoggerFactory.getLogger(MessageProducer.class);

    @Resource
    private RabbitTemplate template;
    
    @Value("${mq_base_userData_exchage_name}")
	private String exchange;
    
	@Value("${mq_base_userData_queue_name}")
	private String queueName;
	
	@Value("${mq_base_userData_routingKey_name}")
	private String routingKey;
	
	@Bean
	public Binding bindingExchangeQueue(DirectExchange exchange, Queue queue) {
		return BindingBuilder.bind(queue).to(exchange).with(routingKey) ;
	}
	
	@Bean
	public DirectExchange getDirectExchange() {
		return new DirectExchange(exchange, true, true);
	}
	
	@Bean
	public Queue queue() {
		return new Queue(queueName);
	}

    public void sendMessage(Object message){
        CorrelationData correlationId = new CorrelationData(null);
        template.setMandatory(true);
        template.convertAndSend(exchange,routingKey, JSON.toJSONString(message),correlationId);

    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {

    }

    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
    }
}
