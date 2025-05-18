package com.salon.controller;

import com.salon.modal.User;
import com.salon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
    private UserRepository userRepository;



@GetMapping("/api/users")
    public User getUser(){
        User user = new User();
        user.setEmail("abhinav@gmail.com");
        user.setFullName("abhinav");
        user.setPhone("+91 9511195090");
        user.setRole("Customer");
        return user;
    }
}

