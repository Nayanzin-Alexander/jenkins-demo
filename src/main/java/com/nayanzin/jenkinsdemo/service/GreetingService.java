package com.nayanzin.jenkinsdemo.service;

import static java.text.MessageFormat.format;

import com.nayanzin.jenkinsdemo.dto.GreetingsDto;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingsDto greet(String name) {
        String greeting = format("Hello, {0}!", name);
        GreetingsDto greetingsDto = new GreetingsDto();
        greetingsDto.setGreeting(greeting);
        return greetingsDto;
    }
}
