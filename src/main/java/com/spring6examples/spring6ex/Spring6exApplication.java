package com.spring6examples.spring6ex;

import com.spring6examples.spring6ex.controllers.myController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6exApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Spring6exApplication.class, args);

		myController controller = ctx.getBean(myController.class);

		System.out.println(controller.sayHello());
	}

}
