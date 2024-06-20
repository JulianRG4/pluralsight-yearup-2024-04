package com.pluralsight.demo.controllers;

import com.pluralsight.demo.models.Category;
import com.pluralsight.demo.models.Product;
import com.pluralsight.demo.services.Categories.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController
{
    private CategoryDao categoryDao;

    @Autowired
    public CategoryController(CategoryDao categoryDao)
    {
        this.categoryDao = categoryDao;
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories()
    {
        return categoryDao.getAll();
    }

    @GetMapping("/categories/{id}")
    public Category getById(@PathVariable int id)
    {
        return categoryDao.getById(id);
    }
}
