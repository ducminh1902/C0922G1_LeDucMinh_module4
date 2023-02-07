package com.codegym.demo1.service;

import com.codegym.demo1.model.Blog;
import com.codegym.demo1.reponsitory.IBlogReponsitory;
import com.codegym.demo1.service.impl.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BlogService implements IBlogService {

    @Autowired
    IBlogReponsitory blogReponsitory;

    @Override
    public List<Blog> findAll() {
        return blogReponsitory.findAll();
    }

    @Override
    public Blog add(Blog blog) {
        return blogReponsitory.save(blog);
    }
    @Override
    public Blog findByID(int id) {
        return blogReponsitory.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        blogReponsitory.deleteById(id);
    }

    @Override
    public Blog update(Blog blog) {
        return blogReponsitory.save(blog);
    }


}
