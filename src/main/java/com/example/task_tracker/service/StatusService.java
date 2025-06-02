package com.example.task_tracker.service;

import com.example.task_tracker.entity.Status;
import com.example.task_tracker.entity.Task;

import java.util.List;

public interface StatusService {
    List<Status> getAllStatuses();
    Status addStatus(Status status);
    String updateStatus(Status status);
    String deleteStatus(Long id);
}
