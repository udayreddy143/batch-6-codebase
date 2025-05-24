package com.jaswin.springJdbcProgram.controller;

import com.jaswin.springJdbcProgram.repository.CurdOperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CurdOperationController {


    @Autowired
    CurdOperationRepository repository;
    public  void saveData() {


        repository.saveData(1,"yogi","chittor","english");
    }

    public  void deleteData() {


        repository.deleteData(1);
    }
}
