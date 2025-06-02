package com.example.task_tracker.service.impl;

import com.example.task_tracker.entity.Task;
import com.example.task_tracker.repository.TaskRepository;
import com.example.task_tracker.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task addTask(Task task) {
        taskRepository.save(task);
        return task;
    }

    @Override
    public String updateTask(Task task) {
        taskRepository.save(task);
        return "Successfully updated task!";
    }

    @Override
    public String deleteTask(Long id) {
        taskRepository.deleteById(id);
        return "Successfully deleted task!";
    }
}
