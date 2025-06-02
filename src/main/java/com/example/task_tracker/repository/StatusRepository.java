package com.example.task_tracker.repository;

import com.example.task_tracker.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
