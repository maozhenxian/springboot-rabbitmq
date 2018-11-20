package com.mzx.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;
@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }
}
