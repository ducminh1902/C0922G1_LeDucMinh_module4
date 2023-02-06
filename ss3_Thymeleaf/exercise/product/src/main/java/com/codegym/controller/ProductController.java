package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping("/products")
    public String showList(Model model){
        List<Product> productList = productService.display();
        model.addAttribute("list",productList);
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String delete(Model model , @PathVariable int id){
       productService.delete(id);
       model.addAttribute("list",productService.display());
       return "list";
    }

    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("product") Product product){
        productService.add(product);
        model.addAttribute("list",productService.display());
        return "list";
    }

    @GetMapping("/showFormEdit/{id}")
    public String showFormEdit(Model model,@PathVariable int id){
        Product product1= productService.findById(id);
        model.addAttribute("product1",product1);
        return "edit";
    }

    @GetMapping("/findByID/{id}")
    public String showProduct(Model model,@PathVariable int id){
        Product product = productService.findById(id);
        model.addAttribute("productById",product);
        return "list2";
    }


    @GetMapping("/findByName")
    public String findProduct(Model model,@RequestParam(name = "name") String name){
        List<Product> product = productService.findByName(name);
        model.addAttribute("list",product);
        return "list";
    }


    @GetMapping("/edit")
    public String edit(Model model, @PathVariable Product product){
        productService.update(product);
        return "list";
    }
}
