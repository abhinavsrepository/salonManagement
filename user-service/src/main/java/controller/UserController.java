package controller;

import com.salon.modal.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

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

