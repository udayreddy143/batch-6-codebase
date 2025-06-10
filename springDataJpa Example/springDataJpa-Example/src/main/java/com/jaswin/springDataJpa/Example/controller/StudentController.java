package com.jaswin.springDataJpa.Example.controller;

import com.jaswin.springDataJpa.Example.entity.StudentEntity;
import com.jaswin.springDataJpa.Example.model.Student;
import com.jaswin.springDataJpa.Example.repository.StudentRepository;
import com.jaswin.springDataJpa.Example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {



    @Autowired
    private StudentService studentService;
    @PostMapping
    public void saveData(@RequestBody  Student student){

        studentService.saveData(student);




    }
}
