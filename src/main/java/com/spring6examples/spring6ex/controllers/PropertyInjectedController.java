package com.spring6examples.spring6ex.controllers;

import com.spring6examples.spring6ex.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller//annotated the controllers for spring to recognize
public class PropertyInjectedController {

@Autowired //giving a hint that we want it to be injected field injection is not recommended
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

//***least preferred way of doing dependency injection***
//not recommended
