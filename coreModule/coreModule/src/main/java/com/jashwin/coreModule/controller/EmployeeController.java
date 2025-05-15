package com.jashwin.coreModule.controller;

import com.jashwin.coreModule.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeController {

   public EmployeeController(){
        System.out.println("employee controller bean");
    }

    @Autowired
     EmployeeService employeeService;
   public  String displayMessage(){

       // i need to return mesdsage from  service layer

       //EmployeeService employeeService = new EmployeeService();
       String response = employeeService.display();
       return  response;
    }
}
