package com.chinkyfamily.demo.Basics_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BasicsSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicsSpringBootApplication.class, args);
    }

    @GetMapping
    public String homeRoute() {
        return "Welcome to Spring Boot Basics";
    }
}
