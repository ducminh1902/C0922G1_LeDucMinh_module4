package com.codegym.controller;

import com.codegym.model.Student;
import com.codegym.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    IStudentService studentService;

    @GetMapping("/showList")
    public String showList(Model model){
        List<Student> studentList = studentService.display();
        model.addAttribute("listStudent",studentList);
        return "list";
    }
}
