package com.example.task_tracker.service;

import com.example.task_tracker.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getUser(Long id);
    String addUser(User user);
}
