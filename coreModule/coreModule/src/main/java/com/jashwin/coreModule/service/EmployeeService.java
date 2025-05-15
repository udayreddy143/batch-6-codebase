package com.jashwin.coreModule.service;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

   public  EmployeeService(){
        System.out.println("this is employee Service ");
    }

    public String display(){

        System.out.println("very good demo session by uday");
        return " hey my name is priyanka  welcome to git branch";
    }
}
