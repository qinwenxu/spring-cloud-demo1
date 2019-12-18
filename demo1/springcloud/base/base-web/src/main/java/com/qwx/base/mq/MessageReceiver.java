package com.qwx.base.mq;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/***
 * 消费服务
 */
@Component
public class MessageReceiver {


    private final Logger LOGGER = LoggerFactory.getLogger(MessageReceiver.class);

    /***
     * 消费会员操作汇总的消息
     * @param msg
     */
    @RabbitListener(queues = "${mq_base_userData_queue_name}")
    public void processEquipmentDataMessage(String msg){

        //来源设备日志数据进行处理
    	LOGGER.info("mq_base_userData_queue_name Message:{}", msg);
        if (StringUtils.isBlank(msg)) {
        	return;
        }
        try {
            //JSONObject msgJson = JSON.parseObject(msg);
            LOGGER.info("接受到的消息为{}" + msg);
        } catch (Exception e) {
            LOGGER.error("获取mq_base_userData_queue_name队列异常{}", e);
            return;
        }
    }

}
