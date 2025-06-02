package com.example.task_tracker.controller;

import com.example.task_tracker.entity.Task;
import com.example.task_tracker.entity.User;
import com.example.task_tracker.service.TaskService;
import com.example.task_tracker.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/task")
@RestController
@AllArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping("/getAll")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping("/add")
    public Task addTask(@RequestBody Task task) {
        taskService.addTask(task);
        return task;
    }

    @PutMapping("/update")
    public String updateTask(@RequestBody Task task) {
        taskService.updateTask(task);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "Success";
    }

}
