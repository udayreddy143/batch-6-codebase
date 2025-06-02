package com.jaswin.springJdbcProgram;

import com.jaswin.springJdbcProgram.controller.CurdOperationController;
import com.jaswin.springJdbcProgram.dto.Employee;
import com.jaswin.springJdbcProgram.repository.CurdOperationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcProgramApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcProgramApplication.class, args);
		CurdOperationController curdOperationsExample = context.getBean(CurdOperationController.class);

		//curdOperationsExample.saveData();
		//curdOperationsExample.deleteData();

		//need to print all the rows here

List<Employee> list =curdOperationsExample.fetchDetails(10,"uday");
		System.out.println(list);
	}

}
