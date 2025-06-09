package com.jaswin.springDataJpa.Example.controller;

import com.jaswin.springDataJpa.Example.entity.StudentEntity;
import com.jaswin.springDataJpa.Example.model.Student;
import com.jaswin.springDataJpa.Example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    @PostMapping
    public void saveData(@RequestBody  Student student){

        StudentEntity entity = new StudentEntity();
        entity.setId(student.getId());
        entity.setLanguage(student.getLanguage());
        entity.setPlace(student.getPlace());
        entity.setName(student.getName());
        studentRepository.save(entity);


    }
}
