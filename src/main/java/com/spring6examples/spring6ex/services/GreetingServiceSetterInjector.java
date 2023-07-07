package com.spring6examples.spring6ex.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjector implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Im setting a greeting";
    }
}
