package com.jashwin.coreModule.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {


    @Value("${core.name}")
    private String name;

    public  EmployeeService(){
        System.out.println("this is employee Service ");
    }

    public String display(){

        System.out.println("name is "+ name);

        System.out.println("very good demo session by soujanya");
        return " hey my name is sudee welcome to git branch";
    }
}