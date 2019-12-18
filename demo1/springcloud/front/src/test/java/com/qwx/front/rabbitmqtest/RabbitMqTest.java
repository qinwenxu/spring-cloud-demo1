package com.qwx.front.rabbitmqtest;

import com.qwx.front.FrontApplication;
import com.qwx.front.mq.MessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes= FrontApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RabbitMqTest {

    @Autowired
    private MessageProducer messageProducer;

    @Test
    public void test() {
        messageProducer.sendMessage("hello word");
    }
}
