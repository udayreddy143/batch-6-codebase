package com.jaswin.springDataJpa.Example.service;

import com.jaswin.springDataJpa.Example.entity.StudentEntity;
import com.jaswin.springDataJpa.Example.model.Student;
import com.jaswin.springDataJpa.Example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

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


    public StudentEntity getDetails(int id){

        Optional<StudentEntity> optionalStudentEntity =studentRepository.findById(String.valueOf(id));

        if(optionalStudentEntity.isPresent()){
            StudentEntity entity = optionalStudentEntity.get();
            return entity;
        }else{
            return null;
        }
    }

    public void deleteById(int id){

        studentRepository.deleteById(String.valueOf(id));
    }
    public StudentEntity updateByName(Student student){
        StudentEntity studentData= studentRepository.findByStuName(student.getName());
        if(studentData != null){
            studentData.setId(student.getId());

            studentData.setPlace(student.getPlace());
            studentData.setLanguage(student.getLanguage());
            return studentRepository.save(studentData);
        }
        else{
            return null;
        }

    }

}
