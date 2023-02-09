package com.codegym.demo1.service.blog;

import com.codegym.demo1.model.Blog;
import com.codegym.demo1.reponsitory.blog.IBlogReponsitory;
import com.codegym.demo1.service.blog.impl.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService {

    @Autowired
   private IBlogReponsitory blogReponsitory;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogReponsitory.findAll(pageable);
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

    @Override
    public Page<Blog> findByName(String title,Pageable pageable) {
        return blogReponsitory.findByTitleContaining(title,pageable);
    }


}
