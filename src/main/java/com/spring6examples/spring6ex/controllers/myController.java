package com.spring6examples.spring6ex.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class myController {
    public String sayHello(){
        System.out.println("Im in the controller");

        return "Hello";
    }


}
