package com.chinkyfamily.demo.Basics_SpringBoot.greet;

import org.springframework.stereotype.Service;

@Service
public class GreetService {
    public String greetUser(String name) {
        if (name.isBlank()) {
            name = "World";
        }
        return "Hello " + name;
    }
}
