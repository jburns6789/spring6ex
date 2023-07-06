package com.spring6examples.spring6ex.controllers;

import com.spring6examples.spring6ex.services.GreetingService;
import com.spring6examples.spring6ex.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController setterInjectedController;
   /*@BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
    */

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}