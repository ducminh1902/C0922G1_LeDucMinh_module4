package com.codegym.demo1.controller.category;

import com.codegym.demo1.model.category.Category;
import com.codegym.demo1.service.category.impl.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/category")
    public String showList(Model model){
        List<Category> categoryList = categoryService.findAll();
        model.addAttribute("list",categoryList);
        return "list";
    }
}
