package com.example._1_rabbitmq_consumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class FixedRateConsumer {
    private static final Logger LOG = Logger.getLogger(FixedRateConsumer.class.getName());

    @RabbitListener(queues = "course.fixedrate", concurrency = "3-7")
    private void listen(String message){
        LOG.info("Received Message: " + message);
    }
}
