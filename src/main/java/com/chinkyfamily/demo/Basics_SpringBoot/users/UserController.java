package com.chinkyfamily.demo.Basics_SpringBoot.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    List<User> getUsers() {
        return List.of(new User("Raj K", 24));
    }
}
