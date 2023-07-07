package com.spring6examples.spring6ex.services.i18n;

import com.spring6examples.spring6ex.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class SpanishGreetingService implements GreetingService {
    public String sayGreeting(){return "Hola Mundo - ES";}
}
