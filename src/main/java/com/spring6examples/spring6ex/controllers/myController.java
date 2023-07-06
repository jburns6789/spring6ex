package com.spring6examples.spring6ex.controllers;

import com.spring6examples.spring6ex.services.GreetingService;
import com.spring6examples.spring6ex.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class myController {

    private final GreetingService greetingService;

    public myController() {
        this.greetingService = new GreetingServiceImpl();
    }
    //Controller has all the control on how the service get created
    //this is how its done w/o using DI

    public String sayHello(){
        System.out.println("Im in the controller");

        return greetingService.sayGreeting();
    }


}
