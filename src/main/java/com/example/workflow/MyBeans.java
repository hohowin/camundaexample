package com.example.workflow;

import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class MyBeans {

    @Bean
    public JavaDelegate ahoyService() {
        return execution -> System.out.println("\n\nAhoy " + execution.getVariable("myVariable") + "!");
    }

    @Bean
    public JavaDelegate sendKafka(KafkaTemplate<String, String> kafkaTemplate) {
        return execution -> {
            System.out.println("Sending message to kafka...");
            kafkaTemplate.send("myTopic", "Hello My Dear Kafka :) ");
        };
    }

}
