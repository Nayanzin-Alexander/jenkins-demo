package com.nayanzin.jenkinsdemo.dto;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class GreetingsDto {
    @NotEmpty
    private String greeting;
}
