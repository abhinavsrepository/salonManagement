package com.salon.service.impl;

import com.salon.exception.UserException;
import com.salon.modal.User;
import com.salon.repository.UserRepository;
import com.salon.service.UserService;
import jdk.jshell.spi.ExecutionControl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;



    @Override
    public User creatUser(User user) {
        return userRepository.save(user);

    }

    @Override
    public User getUserById(Long id)throws UserException {
        Optional<User> otp = userRepository.findById(id);
        if (otp.isPresent()) {
            return otp.get();
        }
        throw new UserException("user not found");
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public void updateUser(Long id, User user) throws userException {
        Optional<User> otp = userRepository.findById(id);

        if (otp.isEmpty()) {
            throw new userException("user not found by id" + id);
        }
        User existingUser = otp.get();
        existingUser.setFullName((user.getFullName()
        ));
        existingUser.setEmail(user.getEmail());
        existingUser.setRole(user.getRole());

        return userRepository.save(existingUser);


    }
}
