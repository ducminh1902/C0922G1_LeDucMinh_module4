package com.codegym.demo1.service.category;

import com.codegym.demo1.model.Category;
import com.codegym.demo1.reponsitory.category.ICategoryReponsitory;
import com.codegym.demo1.service.category.impl.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryReponsitory categoryReponsitory;

    @Override
    public List<Category> findAll() {
        return categoryReponsitory.findAll();
    }
}
