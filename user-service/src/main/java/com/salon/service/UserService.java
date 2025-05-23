package com.salon.service;

import com.salon.modal.User;

import java.util.List;

public interface UserService {
    User creatUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}
