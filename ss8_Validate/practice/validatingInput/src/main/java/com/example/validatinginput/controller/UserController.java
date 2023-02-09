package com.example.validatinginput.controller;

import com.example.validatinginput.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/showForm")
    public String showForm(Model model){
      model.addAttribute("user",new User());
       return "index";
    }

    @PostMapping("/validateUser")
    public String validate(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "index";
        }else {
            return "result";
        }
    }
}
