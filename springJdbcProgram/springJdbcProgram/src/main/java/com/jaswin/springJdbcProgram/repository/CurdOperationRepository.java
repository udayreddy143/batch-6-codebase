package com.jaswin.springJdbcProgram.repository;

import com.jaswin.springJdbcProgram.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CurdOperationRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveData(Employee employee){



        String sql = "insert into employee(id,name,place,language) values(?,?,?,?)";

        jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getPlace(),employee.getLanguage());
        System.out.println("data inserted successfully");
    }

    public void deleteData(int id){

        String sql = "delete from employee where id=?";

        jdbcTemplate.update(sql,id);
        System.out.println("data deleted successfully");
    }

    public List<Employee> getEmployees(){

        String sql = "select * from employee";
        List<Employee> employeeList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));

        return employeeList;
    }

    public List<Employee> getEmployees(int id,String name ){

        String sql = "select * from employee where id =? and name =?";

        List<Employee> employeeList = jdbcTemplate.query(sql, new Object[]{id,name},new BeanPropertyRowMapper<>(Employee.class));

        return employeeList;
    }
}
