package com.example.user_validate.controller;

import com.example.user_validate.model.User;
import com.example.user_validate.service.impl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
   private IUserService userService;

    @GetMapping("/user")
    public String showList(Model model){
        model.addAttribute("list",userService.findAll());
        return "list";
    }

    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("user",new User());
        return "create";
    }

    @PostMapping("/validateUser")
    public String validate(@Validated @ModelAttribute("user") User user , BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "list";
        }else {
            return "create";
        }
    }

    @PostMapping("/create")
    public String create(Model model,@ModelAttribute("user") User user){
        userService.add(user);
        model.addAttribute("user",userService.findAll());
        return "list";
    }

}
