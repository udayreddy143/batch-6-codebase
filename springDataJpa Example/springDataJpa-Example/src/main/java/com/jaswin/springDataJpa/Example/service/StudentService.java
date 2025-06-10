package com.jaswin.springDataJpa.Example.service;

import com.jaswin.springDataJpa.Example.entity.StudentEntity;
import com.jaswin.springDataJpa.Example.model.Student;
import com.jaswin.springDataJpa.Example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void saveData(Student student){

        StudentEntity entity = new StudentEntity();
        entity.setId(student.getId());
        entity.setLanguage(student.getLanguage());
        entity.setPlace(student.getPlace());
        entity.setStuName(student.getName());
        studentRepository.save(entity);
    }
}
