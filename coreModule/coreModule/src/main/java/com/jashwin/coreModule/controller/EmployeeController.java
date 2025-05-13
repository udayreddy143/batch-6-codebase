package com.jashwin.coreModule.controller;

import com.jashwin.coreModule.service.EmployeeService;

public class EmployeeController {

   public  String displayMessage(){

       // i need to return mesdsage from  service layer

       EmployeeService employeeService = new EmployeeService();
       String response = employeeService.display();
       return  response;
    }
}
