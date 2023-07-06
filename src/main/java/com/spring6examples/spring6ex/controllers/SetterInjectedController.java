package com.spring6examples.spring6ex.controllers;

import com.spring6examples.spring6ex.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;


    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
