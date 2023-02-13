package com.example.book_library.controller;

import com.example.book_library.model.Book;
import com.example.book_library.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {

    @Autowired
    private IBookService bookService;


    @GetMapping("/book")
    public String showList(Model model){
        model.addAttribute("list",bookService.findAll());
        return "list";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable int id){
        Book book = bookService.findById(id);
        model.addAttribute("list2",book);
        return "list2";
    }

    @GetMapping("/borrow")
    public String borrow(int id, RedirectAttributes redirectAttributes,Model model){
        int code = (int) (Math.random() * (9999 -1000) + 1000);
        Book book = bookService.findById(id);
        if (book.getNumber() == 0 ){
             throw  new NullPointerException("Đã hết sách");
        }
        book.setNumber(book.getNumber()-1);
         model.addAttribute("list",bookService.findAll());
        return "list";
    }
}
