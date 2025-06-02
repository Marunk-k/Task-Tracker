package com.example.task_tracker.service;

import com.example.task_tracker.entity.Category;
import com.example.task_tracker.entity.Task;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category addCategory(Category category);
    String updateCategory(Category category);
    String deleteCategory(Long id);
}
