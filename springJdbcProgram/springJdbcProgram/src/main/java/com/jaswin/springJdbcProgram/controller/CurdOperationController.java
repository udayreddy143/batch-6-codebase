package com.jaswin.springJdbcProgram.controller;

import com.jaswin.springJdbcProgram.dto.Employee;
import com.jaswin.springJdbcProgram.repository.CurdOperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CurdOperationController {


    @Autowired
    CurdOperationRepository repository;
    public  void saveData() {


        repository.saveData(11,"tharun","a.p","english");
    }

    public  void deleteData() {


        repository.deleteData(1);
    }

    public List<Employee> fetchDetails(){

      return   repository.getEmployees();
    }

    public List<Employee> fetchDetails(int id,String name){

        return   repository.getEmployees(id,name);
    }
}
