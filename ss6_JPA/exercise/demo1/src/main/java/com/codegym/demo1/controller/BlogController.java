package com.codegym.demo1.controller;

import com.codegym.demo1.model.Blog;
import com.codegym.demo1.service.impl.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    IBlogService blogService;

    @GetMapping("/Blogs")
    public String showList(Model model){
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("list",blogList);
        return "list";
    }


    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("blog",new Blog());
        return "create";
    }

    @PostMapping("/add")
    public String create(Model model, @ModelAttribute("blog") Blog blog){
       blogService.add(blog);
       model.addAttribute("list",blogService.findAll());
       return "list";
    }


    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable int id){
        Blog blog = blogService.findByID(id);
        model.addAttribute("list2",blog);
        return "list2";
    }

    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable int id){
        blogService.delete(id);
        model.addAttribute("list",blogService.findAll());
        return "list";
    }

    @GetMapping("/showFormUpdate/{id}")
    public String showFormUpdate(Model model, @PathVariable int id){
        Blog blog = blogService.findByID(id);
        model.addAttribute("blog",blog);
        return "update";
    }

//    @PostMapping("/update")
//    public String update(Model model,@ModelAttribute Blog blog){
//        Blog success = blogService.update(blog);
//        model.addAttribute("success",success);
////        model.addAttribute("list",blogService.findAll());
//        return "redirect:/Blogs";
//    }
}
