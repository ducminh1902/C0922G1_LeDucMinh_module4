package com.example.controller;

import com.example.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.service.IEmailService;

import java.util.List;

@Controller
public class EmailController {

    @Autowired
    IEmailService emailService ;

    @GetMapping("/emails")
    public String display(Model model){
        List<Email> list = emailService.display();
        model.addAttribute("list",list);
        return "list-emails";
    }

    @GetMapping("/showForm/{id}")
    public String findById(@PathVariable("id") int id, Model model){
       Email emailEdit = emailService.findById(id);
       model.addAttribute("email",emailEdit);
       return "update";
    }

    @PostMapping("/emailEdit")
    public String update(@ModelAttribute("email") Email email,Model model){
        boolean success = emailService.update(email);
        model.addAttribute("success",success);
        model.addAttribute("list",emailService.display());
        return "list-emails";
    }
}
