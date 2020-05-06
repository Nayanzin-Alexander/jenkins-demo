package com.nayanzin.jenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Entry point to the application.
 */
@SpringBootApplication
public class JenkinsDemoApplication {

    private static Logger log = LoggerFactory.getLogger("JenkinsDemoApplication");

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

    /**
     * Logs "Hello world!!!" with "info" severity.
     *
     * @return Command Line Runner
     */
    @Bean
    public CommandLineRunner logHelloWorld() {
        return args -> log.info("Hello World!!!");
    }
}
