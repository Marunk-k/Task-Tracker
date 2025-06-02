package com.example.task_tracker.service;

import com.example.task_tracker.entity.Task;
import com.example.task_tracker.entity.User;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task addTask(Task task);
    String updateTask(Task task);
    String deleteTask(Long id);
}
