package com.example.usercrudapplication.service;

import com.example.usercrudapplication.model.User;
import com.example.usercrudapplication.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cannot find user with id: " + id));
    }

    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }
}
