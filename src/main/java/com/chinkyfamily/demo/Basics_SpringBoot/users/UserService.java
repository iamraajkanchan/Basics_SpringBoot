package com.chinkyfamily.demo.Basics_SpringBoot.users;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
class UserService {
    List<User> getUsers() {
        User firstUser = new User("Raj K", 34);
        User secondUser = new User("Ravi K", 34);
        User thirdUser = new User("Kalyani K", 53);
        return List.of(firstUser, secondUser, thirdUser);
    }
}
