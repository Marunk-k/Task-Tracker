package com.example.task_tracker.service;

import com.example.task_tracker.entity.Category;
import com.example.task_tracker.entity.Status;
import com.example.task_tracker.entity.Task;
import com.example.task_tracker.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    // Optional<User> getUser(Long id);
    List<User> getAllUsers();
    User addUser(User user);
    String updateUser(User user);
    String deleteUser(Long id);

}
