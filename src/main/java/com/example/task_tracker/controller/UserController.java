package com.example.task_tracker.controller;

import com.example.task_tracker.entity.Category;
import com.example.task_tracker.entity.Status;
import com.example.task_tracker.entity.Task;
import com.example.task_tracker.entity.User;
import com.example.task_tracker.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/app_user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/get/allStatuses")
    public List<Status> getAllStatuses() {
        return userService.getAllStatuses();
    }

    @GetMapping("/get/allCategories")
    public List<Category> getAllCategories() {
        return userService.getAllCategories();
    }

    @GetMapping("/get/allTasks")
    public List<Task> getAllTasks() {
        return userService.getAllTasks();
    }

    // CRUD для User
    @GetMapping("/get/allUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/add/user")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "Success";
    }

    @PutMapping("/update/user")
    public String updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return "Success";
    }

    @DeleteMapping("/delete/user/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "Success";
    }
}
