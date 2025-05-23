package com.jaswin.springJdbcProgram.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CurdOperationsExample {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveData(){
        String sql = "insert into employee(id,name,place,language) values(10,'uday','chittoor','english')";

        jdbcTemplate.update(sql);
        System.out.println("data inserted successfully");
    }
}
