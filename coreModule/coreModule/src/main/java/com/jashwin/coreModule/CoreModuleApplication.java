package com.jashwin.coreModule;

import com.jashwin.coreModule.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.jashwin.coreModule","uday"} )
public class CoreModuleApplication {

//	@Autowired
//	 EmployeeController controller;
	public static void main(String[] args) {

	ApplicationContext context =  SpringApplication.run(CoreModuleApplication.class, args);  // got the IOC container

	EmployeeController controller = (EmployeeController) context.getBean("empController");
		EmployeeController controller1 = (EmployeeController) context.getBean("empController");


		System.out.println(controller==controller1);
		System.out.println("learning springboot ");

		//EmployeeController controller= new EmployeeController();
		String message = controller.displayMessage();
		System.out.println(message);

	}

}
