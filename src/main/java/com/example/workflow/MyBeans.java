package com.example.workflow;

import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeans {

    @Bean
    public JavaDelegate ahoyService() {
        return execution -> System.out.println("\n\nAhoy " + execution.getVariable("myVariable") + "!");
    }
}
