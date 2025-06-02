package com.example.task_tracker.service.impl;

import com.example.task_tracker.entity.Category;
import com.example.task_tracker.repository.CategoryRepository;
import com.example.task_tracker.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category addCategory(Category category) {
        categoryRepository.save(category);
        return category;
    }

    @Override
    public String updateCategory(Category category) {
        categoryRepository.save(category);
        return "Successfully updated category!";
    }

    @Override
    public String deleteCategory(Long id) {
        categoryRepository.deleteById(id);
        return "Successfully deleted category!";
    }
}
