package com.example.demo1.controller;

import com.example.demo1.dto.UserDto;
import com.example.demo1.model.User;
import com.example.demo1.service.IUserService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
        model.addAttribute("userDto",new UserDto());
        return "create";
    }

    @PostMapping("/add")
    public String create(Model model, @Validated @ModelAttribute UserDto userDto, BindingResult bindingResult ,
                         RedirectAttributes redirects){
        if (bindingResult.hasErrors()){
          model.addAttribute("userDto",userDto);
          return "create";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        userService.add(user);
        redirects.addFlashAttribute("mess","thêm mới thành công");
        return "redirect:/user";
    }
}
