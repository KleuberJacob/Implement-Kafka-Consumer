package com.example.consumer.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    @KafkaListener(topics = "javatechie-demo3", groupId = "jt-group-1")
    public void consumidor(String message) {
        System.out.println("Consumindo a menssagem: " + message);
    }

}
