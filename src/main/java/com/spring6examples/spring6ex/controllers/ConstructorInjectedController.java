package com.spring6examples.spring6ex.controllers;

import com.spring6examples.spring6ex.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller//annotated the controllers for spring to recognize
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

//***This is the best way to be doing dependency injection use final property then initializing***
