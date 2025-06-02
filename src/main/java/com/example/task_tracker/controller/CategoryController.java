package com.example.task_tracker.controller;

import com.example.task_tracker.entity.Category;
import com.example.task_tracker.entity.Task;
import com.example.task_tracker.service.CategoryService;
import com.example.task_tracker.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/category")
@RestController
@AllArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/getAll")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("/add")
    public Category addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
        return category;
    }

    @PutMapping("/update")
    public String updateCategory(@RequestBody Category category) {
        categoryService.updateCategory(category);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return "Success";
    }
}
