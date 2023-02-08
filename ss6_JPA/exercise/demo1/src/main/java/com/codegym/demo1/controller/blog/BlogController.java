package com.codegym.demo1.controller.blog;

import com.codegym.demo1.model.blog.Blog;
import com.codegym.demo1.service.blog.impl.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @GetMapping("/Blogs")
    public String showList(Model model,@RequestParam(required = false,defaultValue = "") String nameSearch,
                           @PageableDefault(size = 3,page = 0,sort = "title",direction = Sort.Direction.ASC) Pageable pageable){
        Page<Blog> blogPage = blogService.findByName(nameSearch, pageable);
        model.addAttribute("nameSearch",nameSearch);
        model.addAttribute("blogPage",blogPage);
        return "list";
    }


    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("blog",new Blog());
        return "create";
    }

    @PostMapping("/add&update")
    public String create(Model model, @ModelAttribute("blog") Blog blog,@PageableDefault Pageable pageable){
       blogService.add(blog);
       model.addAttribute("blogPage",blogService.findAll(pageable));
       return "list";
    }


    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable int id){
        Blog blog = blogService.findByID(id);
        model.addAttribute("list2",blog);
        return "list2";
    }

    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable int id,@PageableDefault Pageable pageable){
        blogService.delete(id);
        model.addAttribute("blogPage",blogService.findAll(pageable));
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
