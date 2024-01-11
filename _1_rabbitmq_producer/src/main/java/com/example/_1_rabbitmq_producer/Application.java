package com.example._1_rabbitmq_producer;

import com.example._1_rabbitmq_producer.producer.RabbitProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.ThreadLocalRandom;

@EnableScheduling
@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private RabbitProducer rabbitProducer;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        rabbitProducer.sendHello("Hello from RabbitMQ!" + ThreadLocalRandom.current().nextInt());

    }

}
