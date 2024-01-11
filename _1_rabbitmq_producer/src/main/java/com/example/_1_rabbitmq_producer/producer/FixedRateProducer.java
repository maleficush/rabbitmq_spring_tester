package com.example._1_rabbitmq_producer.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class FixedRateProducer {

    private static final Logger LOG = Logger.getLogger(FixedRateProducer.class.getName());
    @Autowired
    private RabbitTemplate rabbitTemplate;

    private final String ROUTING_KEY = "course.fixedrate";

    private int i = 0;

//    @Scheduled(fixedRate = 300)
    public void sendMessage(){
        i++;
        LOG.info("i is : " + i);
        rabbitTemplate.convertAndSend(ROUTING_KEY, "Fixed rate : " + i  );
    }

}
