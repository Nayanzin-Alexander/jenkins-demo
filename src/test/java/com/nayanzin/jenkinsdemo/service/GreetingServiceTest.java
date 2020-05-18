package com.nayanzin.jenkinsdemo.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.nayanzin.jenkinsdemo.dto.GreetingsDto;
import org.junit.jupiter.api.Test;

class GreetingServiceTest {

    private GreetingService greetingService = new GreetingService();

    @Test
    void givenValidUsername_whenGreet_thenGreetingReturns() {
        GreetingsDto expected = new GreetingsDto();
        expected.setGreeting("Hello, username!");
        GreetingsDto actual = greetingService.greet("username");
        assertThat(actual).isEqualTo(expected);
    }
}