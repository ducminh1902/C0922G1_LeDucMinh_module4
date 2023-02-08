package com.codegym.demo1.service.blog.impl;

import com.codegym.demo1.model.blog.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog add(Blog blog);


    Blog findByID(int id);

    void delete(int id);

    Blog update(Blog blog);

    Page<Blog> findByName(String title,Pageable pageable);
}
