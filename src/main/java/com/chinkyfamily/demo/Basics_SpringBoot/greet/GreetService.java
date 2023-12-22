package com.chinkyfamily.demo.Basics_SpringBoot.greet;

import com.chinkyfamily.demo.Basics_SpringBoot.BasicsSpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GreetService {
    public ResponseEntity<String> greetUser(String name) {
        if (name.isBlank()) {
            name = "World";
        }
        BasicsSpringBootApplication.log.info("Status : " + HttpStatus.ACCEPTED);
        return new ResponseEntity<>("Hello " + name, HttpStatus.ACCEPTED);
    }
}
