package com.jaswin.springJdbcProgram;

import com.jaswin.springJdbcProgram.controller.CurdOperationController;
import com.jaswin.springJdbcProgram.repository.CurdOperationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcProgramApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcProgramApplication.class, args);
		CurdOperationController curdOperationsExample = context.getBean(CurdOperationController.class);

		//curdOperationsExample.saveData();
		curdOperationsExample.deleteData();

	}

}
