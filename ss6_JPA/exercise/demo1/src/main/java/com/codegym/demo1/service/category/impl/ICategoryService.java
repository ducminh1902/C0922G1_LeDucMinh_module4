package com.codegym.demo1.service.category.impl;

import com.codegym.demo1.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Category findById(int id);

    void add(Category category);

    void delete(int id);

}
