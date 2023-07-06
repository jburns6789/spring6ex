package com.spring6examples.spring6ex.services;

import org.springframework.stereotype.Service;

@Service //add for spring to recognized that its a spring managed component
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from the base service";
    }
}
