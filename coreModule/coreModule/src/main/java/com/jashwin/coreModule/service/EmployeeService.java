package com.jashwin.coreModule.service;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class EmployeeService {

   public  EmployeeService(){
        System.out.println("this is employee Service ");
    }

    public String display(){

        System.out.println("very good demo session by soujanya");
        System.out.println("Soujanya is woked on postconstruct task");
        return " hey my name is sudee welcome to git branch";
    }
}
