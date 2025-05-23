package com.jashwin.coreModule.configuration;

import com.jashwin.coreModule.controller.EmployeeController;
import com.jashwin.coreModule.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreConfiguration {

    public CoreConfiguration(){
        System.out.println("configuration executed");
    }

//    @Bean
//    public EmployeeService employeeService(@Value("${core.name}") String name){
//        return new EmployeeService(name);
//    }

//    @Bean
//    public EmployeeController employeeController(@Autowired  EmployeeService employeeService){
//        return new EmployeeController(employeeService);
//    }
}
