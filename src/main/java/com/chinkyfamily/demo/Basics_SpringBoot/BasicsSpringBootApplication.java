package com.chinkyfamily.demo.Basics_SpringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicsSpringBootApplication {
    public static final Logger log = LoggerFactory.getLogger(BasicsSpringBootApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(BasicsSpringBootApplication.class, args);
    }
}
