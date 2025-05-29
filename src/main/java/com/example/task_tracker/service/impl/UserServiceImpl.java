package com.example.task_tracker.service.impl;

import com.example.task_tracker.entity.User;
import com.example.task_tracker.repository.UserRepository;
import com.example.task_tracker.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
   private UserRepository userRepository;
   
    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public String addUser(User user) {
        return "hello!!";
    }
}
