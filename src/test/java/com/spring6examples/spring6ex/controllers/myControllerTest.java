package com.spring6examples.spring6ex.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myControllerTest {

    @Test
    void sayHello() {
        myController myControllerT = new myController();

        System.out.println(myControllerT.sayHello());
    }
}