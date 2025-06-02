package com.example.task_tracker.service.impl;

import com.example.task_tracker.entity.Status;
import com.example.task_tracker.repository.StatusRepository;
import com.example.task_tracker.repository.UserRepository;
import com.example.task_tracker.service.StatusService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StatusServiceImpl implements StatusService {
    private StatusRepository statusRepository;

    @Override
    public List<Status> getAllStatuses() {
        return statusRepository.findAll();
    }

    @Override
    public Status addStatus(Status status) {
        statusRepository.save(status);
        return status;
    }

    @Override
    public String updateStatus(Status status) {
        statusRepository.save(status);
        return "Successfully updated status!";
    }

    @Override
    public String deleteStatus(Long id) {
        statusRepository.deleteById(id);
        return "Successfully deleted status!";
    }
}
