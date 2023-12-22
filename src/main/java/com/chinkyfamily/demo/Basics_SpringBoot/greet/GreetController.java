package com.chinkyfamily.demo.Basics_SpringBoot.greet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/greet")
public class GreetController {
    private final GreetService service;

    @Autowired
    public GreetController(GreetService service) {
        this.service = service;
    }

    @PostMapping
    public String greetUser(@RequestBody String name) {
        return service.greetUser(name);
    }
}
