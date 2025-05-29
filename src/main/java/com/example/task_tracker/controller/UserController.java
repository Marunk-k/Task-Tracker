package com.example.task_tracker.controller;

import com.example.task_tracker.entity.User;
import com.example.task_tracker.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/get/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "Good!!";
    }
}
