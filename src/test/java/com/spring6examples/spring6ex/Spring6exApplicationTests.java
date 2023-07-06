package com.spring6examples.spring6ex;

import com.spring6examples.spring6ex.controllers.myController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6exApplicationTests {

	@Autowired //tells spring context to inject a context
	ApplicationContext applicationContext;

	@Autowired
	myController myController;

	@Test
	void testAutowireOfController(){
		System.out.println(myController.sayHello());
	} //dependency injection working through spring "asking"

	@Test
	void testGetControllerFromCtx() {
		myController myController = applicationContext.getBean(myController.class);

		System.out.println(myController.sayHello());
	}
	//telling spring to inject a dependency, two different method to do the same thing

	@Test
	void contextLoads() {
	}

}
