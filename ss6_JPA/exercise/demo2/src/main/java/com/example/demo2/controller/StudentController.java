package com.example.demo2.controller;

import com.example.demo2.model.Student;
import com.example.demo2.service.impl.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    IStudentService studentService;

    @GetMapping("/student")
    public String showList(Model model){
        List<Student> studentList = studentService.findAll();
        model.addAttribute("list",studentList);
        return "list";
    }


    @GetMapping("/delete/{id}")
    public String delete(Model model , @PathVariable int id){
        studentService.delete(id);
        model.addAttribute("list",studentService.findAll());
        return "list";
    }

    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("student",new Student());
        return "create";
    }

    @PostMapping("/create")
    public String add(Model model, @ModelAttribute("student") Student student){
        studentService.add(student);
        model.addAttribute("list",studentService.findAll());
        return "list";
    }
}
