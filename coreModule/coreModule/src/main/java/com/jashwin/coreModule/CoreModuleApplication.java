package com.jashwin.coreModule;

import com.jashwin.coreModule.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreModuleApplication.class, args);

		System.out.println("learning springboot ");

		EmployeeController controller= new EmployeeController();
		String message = controller.displayMessage();
		System.out.println(message);

	}

}
