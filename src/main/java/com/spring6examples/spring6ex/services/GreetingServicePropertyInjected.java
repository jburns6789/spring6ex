package com.spring6examples.spring6ex.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyInjected implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Friends dont let friends do property Injection!!!";
    }
}
