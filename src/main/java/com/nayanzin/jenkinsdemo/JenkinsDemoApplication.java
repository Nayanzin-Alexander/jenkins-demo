package com.nayanzin.jenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JenkinsDemoApplication {

    private static Logger log = LoggerFactory.getLogger("JenkinsDemoApplication");

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner printHelloWorld() {
        return args -> log.info("Hello World!!!");
    }
}
