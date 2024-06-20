package com.pluralsight.demo.services.Products;

import com.pluralsight.demo.models.Product;

import java.util.List;

public interface ProductsDao
{
    List<Product> getAll();
    Product getById(int id);
}
