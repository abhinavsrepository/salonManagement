package com.salon.controller;

import com.salon.modal.User;
import com.salon.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

//     @PostMapping("/api/users")
// //request body will get data from client
//     public User createUser(@RequestBody @Valid User user) {

//     }

//     @GetMapping("/api/users")
//     public List<User> getUser() {


//     }

//     @GetMapping("/api/users/{userId}")
//     public User getUserById(@PathVariable("userId") Long id) throws Exception {

//     }

//     //updating the user name in database;
//     @PutMapping("/api/users/{id}")
//     public User updateUser(@RequestBody User user, @PathVariable Long id) throws Exception {




//     }
    @DeleteMapping("/api/users/{id}")
    public  String deleteUserById(@PathVariable Long id) throws Exception{
        Optional<User> otp = userRepository.findById(id);

        if (otp.isEmpty()) {
            throw new Exception("user not existe by id" + id);
        }
        userRepository.deleteById(otp.get().getId());
        return "user deleted";



    }

}

