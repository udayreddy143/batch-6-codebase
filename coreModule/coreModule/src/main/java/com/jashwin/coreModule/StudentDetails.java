package com.jashwin.coreModule;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class StudentDetails {

    @PostConstruct
    public void postConstruct(){
        System.out.println("Postconstruct is excuted");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("preDestroy is excuted");
    }
}
