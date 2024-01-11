package com.example._1_rabbitmq_consumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitConsumer {

    @RabbitListener(queues = "course.hello")
    private void listen(String message){
        System.out.println("Received Message: " + message);
    }

}
