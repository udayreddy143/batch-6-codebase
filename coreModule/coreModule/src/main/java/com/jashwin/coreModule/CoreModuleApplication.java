
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

		System.out.println("apploication startred");
		ApplicationContext context =  SpringApplication.run(CoreModuleApplication.class, args);  // got the IOC container

		System.out.println(" container intailzed");
		EmployeeController controller = context.getBean(EmployeeController.class);
		System.out.println("learning springboot ");

		//EmployeeController controller= new EmployeeController();
		String message = controller.displayMessage();
		System.out.println(message);

	}

}
