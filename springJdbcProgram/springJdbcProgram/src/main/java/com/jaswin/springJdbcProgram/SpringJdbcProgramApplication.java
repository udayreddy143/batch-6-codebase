package com.jaswin.springJdbcProgram;

import com.jaswin.springJdbcProgram.repository.CurdOperationsExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcProgramApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcProgramApplication.class, args);
		CurdOperationsExample curdOperationsExample = context.getBean(CurdOperationsExample.class);

		curdOperationsExample.saveData();
	}

}
