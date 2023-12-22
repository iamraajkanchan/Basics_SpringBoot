package com.chinkyfamily.demo.Basics_SpringBoot.users;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class UserConfig {
    @Bean
    CommandLineRunner userCommandLineRunner(UserRepository userRepository) {
        return args -> {
            User firstUser = new User();
            firstUser.setFirstName("Barry");
            firstUser.setLastName("Allen");
            firstUser.setAge(34);
            User secondUser = new User();
            secondUser.setFirstName("John");
            secondUser.setLastName("Snow");
            secondUser.setAge(34);
            User thirdUser = new User();
            thirdUser.setFirstName("Peter");
            thirdUser.setLastName("Parker");
            thirdUser.setAge(46);
            userRepository.saveAll(List.of(firstUser, secondUser, thirdUser));
        };
    }
}
