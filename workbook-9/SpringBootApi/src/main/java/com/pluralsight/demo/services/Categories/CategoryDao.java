package com.pluralsight.demo.services.Categories;

import com.pluralsight.demo.models.Category;

import java.util.List;

public interface CategoryDao
{
    List<Category> getAll();
    Category getById(int id);
}
