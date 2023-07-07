package com.spring6examples.spring6ex.controllers;

import com.spring6examples.spring6ex.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller//annotated the controllers for spring to recognize
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("setterGreetingBean")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("SetterInjectedController.setGreetingService");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    //annotation (Autowired) needs to be placed on the method and not the property
    //to be utilized
}
