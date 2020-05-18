package com.nayanzin.jenkinsdemo.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import com.nayanzin.jenkinsdemo.dto.GreetingsDto;
import com.nayanzin.jenkinsdemo.service.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class GreetingsControllerTest {

    private GreetingService greetingService = mock(GreetingService.class);
    private GreetingsController greetingsController;

    @BeforeEach
    public void setUp() {
        greetingsController = new GreetingsController(greetingService);
    }

    @Test
    public void givenNotEmptyName_whenGreet_thenValidGreetingsReturns() {
        GreetingsDto expected = new GreetingsDto();
        expected.setGreeting("Hello, username!");
        String name = "Username";
        Mockito.when(greetingService.greet(name)).thenReturn(expected);
        GreetingsDto actual = greetingsController.greet(name);
        assertThat(actual).isEqualTo(expected);
    }
}