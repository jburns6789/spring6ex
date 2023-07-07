package com.spring6examples.spring6ex.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary//two  services doing the same thing using  primary tells spring which one to use first
@Service
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String sayGreeting(){
        return "Hello from the primary Bean";
    }
}
