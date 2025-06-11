package com.jaswin.springDataJpa.Example.repository;

import com.jaswin.springDataJpa.Example.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, String> {

    StudentEntity findByStuName(String name);
}
