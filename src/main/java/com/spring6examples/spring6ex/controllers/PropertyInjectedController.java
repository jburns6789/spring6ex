package com.spring6examples.spring6ex.controllers;

import com.spring6examples.spring6ex.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

//least preferred way of doing dependency injection
