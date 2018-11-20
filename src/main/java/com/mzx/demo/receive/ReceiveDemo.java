package com.mzx.demo.receive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveDemo {

    // 接收队列中的消息
    @RabbitHandler
    @RabbitListener(queues = "hello")
    public void process(String str) {
        System.out.println("1-接收到的信息：" + str);
    }
    
    // 接收队列中的消息
    @RabbitHandler
    @RabbitListener(queues = "hello")
    public void process2(String str) {
        System.out.println("2-接收到的信息：" + str);
    }
}
