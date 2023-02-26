package com.example.test1.controller;

import com.example.test1.model.Student;
import com.example.test1.service.IRankService;
import com.example.test1.service.IStudentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    private IStudentService studentService;
    @Autowired
    private IRankService rankService;

    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("list",studentService.findAll());
        model.addAttribute("rank",rankService.findAll());
        return "list";
    }

    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("student",new Student());
        model.addAttribute("rank",rankService.findAll());
        return "create";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("student") Student student){
        studentService.add(student);
        model.addAttribute("list",studentService.findAll());
        return "redirect:/student";
    }

    @GetMapping("delete/{id}")
    public String delete(Model model, @PathVariable int id){
        studentService.delete(id);
        model.addAttribute("list",studentService.findAll());
        model.addAttribute("rank",rankService.findAll());
        return "redirect:/student";
    }

    @GetMapping("showEdit/{id}")
    public String showEdit(Model model, @PathVariable int id){
        Student student = studentService.finfdById(id).get();
        model.addAttribute("student",student);
        model.addAttribute("rank",rankService.findAll());
        return "update";
    }

    @GetMapping("search")
    public String search(Model model,@RequestParam String name,@RequestParam String rank1){
        List<Student> studentList = studentService.search(name,rank1);
        model.addAttribute("list2",studentList);
        return "search";
    }
}
