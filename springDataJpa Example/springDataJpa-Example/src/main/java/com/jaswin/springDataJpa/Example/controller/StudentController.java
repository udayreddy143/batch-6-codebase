package com.jaswin.springDataJpa.Example.controller;

import com.jaswin.springDataJpa.Example.entity.StudentEntity;
import com.jaswin.springDataJpa.Example.model.Student;
import com.jaswin.springDataJpa.Example.repository.StudentRepository;
import com.jaswin.springDataJpa.Example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {



    @Autowired
    private StudentService studentService;
    @PostMapping
    public void saveData(@RequestBody  Student student){

        studentService.saveData(student);
    }

    @GetMapping
    public StudentEntity getDetails(@RequestParam("id") int id){

        StudentEntity entity = studentService.getDetails(id);
        return entity;
    }

    @DeleteMapping
    public void deleteByEmpId(@RequestParam("id") int id) {
        studentService.deleteById(id);
    }

    @PutMapping("/update")
    public void updateByName(@RequestBody  Student student){
        studentService.updateByName(student);
    }

    //update request
    //1. first get all data
    //2. repository findByName
    //3. chcek object contains data or not
    // if data not there  donrt fupdate
    // if data exist then map model to exiusting entity
    // save again same entity

}
