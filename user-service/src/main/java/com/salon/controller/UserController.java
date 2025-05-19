package com.salon.controller;

import com.salon.modal.User;
import com.salon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/users")
//request body will get data from client
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);

    }

    @GetMapping("/api/users")
    public List<User> getUser() {
        return userRepository.findAll();


    }


    public User getUserById(Long id) throws Exception {
        Optional<User> otp=userRepository.findById(id);
         if (otp.isPresent()){
             return otp.get();
         }
         throw new Exception("user not found");
    }
//    @PutMapping("/api/user/1")
//    public User updateUser(@RequestBody User user){
//
//    }
}

