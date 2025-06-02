package com.jashwin.coreModule.controller;

import com.jashwin.coreModule.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("empController")
@Scope("prototype")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


   public EmployeeController(){

        System.out.println("employee controller bean");
    }

//    @Autowired
//    public void setEmployeeService(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }


//    @Autowired
//     private  EmployeeService employeeService;

    public  String displayMessage(){

        // i need to return mesdsage from  service layer

        //EmployeeService employeeService = new EmployeeService();
        String response = employeeService.display();
        return  response;
    }
}