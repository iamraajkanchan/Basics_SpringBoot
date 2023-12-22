package com.chinkyfamily.demo.Basics_SpringBoot.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    List<User> getUsers() {
        return userRepository.findAll();
    }
}
