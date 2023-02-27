package com.example.test2.controller;

import com.example.test2.model.Student;
import com.example.test2.service.level.ILevelStudentService;
import com.example.test2.service.student.IStudentService;
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
    private ILevelStudentService levelStudentService;



    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("list",studentService.findAll());
        return "list";
    }

    @GetMapping("delete/{id}")
    public String delete(Model model, @PathVariable int id){
        studentService.delete(id);
        model.addAttribute("list",studentService.findAll());
//        model.addAttribute("level",levelStudentService.findAll());
        return "redirect:/student";
    }

    @GetMapping("showForm")
    public String showForm(Model model){
       model.addAttribute("student",new Student());
       model.addAttribute("level",levelStudentService.findAll());
       return "create";
    }

    @PostMapping("add")
    public String add(Model model, @ModelAttribute("student") Student student){
        studentService.add(student);
        model.addAttribute("list",studentService.findAll());
        return "redirect:/student";
    }

    @GetMapping("showEdit/{id}")
    public String showEdit(Model model,@PathVariable int id){
        Student student = studentService.findById(id).get();
        model.addAttribute("student",student);
        model.addAttribute("level",levelStudentService.findAll());
        return "update";
    }

    @GetMapping("search")
    public String search(Model model,@RequestParam String nameSearch){
        List<Student> studentSearch = studentService.findByName(nameSearch);
        model.addAttribute("list2",studentSearch);
        return "search";
    }
}
