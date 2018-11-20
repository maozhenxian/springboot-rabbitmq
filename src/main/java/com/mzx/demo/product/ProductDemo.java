package com.mzx.demo.product;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDemo {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendToQueue(String str) {
        // 发送信息到队列中
        System.out.println("发送的消息：" + str);
        this.amqpTemplate.convertAndSend("hello", str);
    }
}
