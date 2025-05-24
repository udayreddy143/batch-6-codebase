package com.jaswin.springJdbcProgram.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CurdOperationRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveData(int id,String name,String address,String language){
        String sql = "insert into employee(id,name,place,language) values(?,?,?,?)";

        jdbcTemplate.update(sql,id,name,address,language);
        System.out.println("data inserted successfully");
    }

    public void deleteData(int id){

        String sql = "delete from employee where id=?";

        jdbcTemplate.update(sql,id);
        System.out.println("data deleted successfully");
    }
}
