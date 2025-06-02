package com.example.task_tracker.service.impl;

import com.example.task_tracker.entity.Category;
import com.example.task_tracker.entity.Status;
import com.example.task_tracker.entity.Task;
import com.example.task_tracker.entity.User;
import com.example.task_tracker.repository.CategoryRepository;
import com.example.task_tracker.repository.StatusRepository;
import com.example.task_tracker.repository.TaskRepository;
import com.example.task_tracker.repository.UserRepository;
import com.example.task_tracker.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
   private UserRepository userRepository;
   private CategoryRepository categoryRepository;
   private TaskRepository taskRepository;
   private StatusRepository statusRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<Status> getAllStatuses() {
        return statusRepository.findAll();
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "Successfully updated user!";
    }

    @Override
    public String deleteUser(Long userId) {
        if (!userRepository.existsById(userId)) {
            return "User not found";
        }
        userRepository.deleteById(userId); // удалит user + каскадно tasks
        return "User and their tasks successfully deleted";
    }

}
