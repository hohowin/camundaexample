package com.example.workflow;

import org.camunda.bpm.engine.ProcessEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @Autowired
    private ProcessEngine camunda;

    @KafkaListener(topics = "myTopic", groupId = "group_id")
    void listener(String data) {
        System.out.println("Listener receives: " + data);
        camunda.getRuntimeService().createMessageCorrelation("Message_KafkaReceived")
                .processInstanceBusinessKey("bus")
                .correlate();
    }
}
