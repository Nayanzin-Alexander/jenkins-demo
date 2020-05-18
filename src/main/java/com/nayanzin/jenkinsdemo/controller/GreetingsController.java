package com.nayanzin.jenkinsdemo.controller;

import com.nayanzin.jenkinsdemo.dto.GreetingsDto;
import com.nayanzin.jenkinsdemo.service.GreetingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/")
public class GreetingsController {

    private GreetingService greetingService;

    @GetMapping("{username}")
    public GreetingsDto greet(@PathVariable("username") String username) {
        return greetingService.greet(username);
    }

}

