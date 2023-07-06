package com.spring6examples.spring6ex.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from the base service";
    }
}
