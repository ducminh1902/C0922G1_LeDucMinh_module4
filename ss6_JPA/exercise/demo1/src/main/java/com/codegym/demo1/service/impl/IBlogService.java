package com.codegym.demo1.service.impl;

import com.codegym.demo1.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog add(Blog blog);


    Blog findByID(int id);

    void delete(int id);

    Blog update(Blog blog);
}
