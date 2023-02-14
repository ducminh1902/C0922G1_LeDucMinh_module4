package com.example.product.controller;

import com.example.product.model.Cart;
import com.example.product.model.Product;
import com.example.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/shop")
    public String showList(Model model){
        model.addAttribute("list",productService.findAll());
        return "list";
    }


    @GetMapping("/detail/{id}")
    public ModelAndView detail(Model model, @PathVariable int id, HttpServletResponse response){
        Cookie cookie = new Cookie("productId",id+"");
        cookie.setMaxAge(1*24*60*60);
        cookie.setPath("/");
        response.addCookie(cookie);
        return new ModelAndView("list2","product",productService.findById(id));
//        Product product = productService.findById(id);
//        model.addAttribute("list2",product);
//        return "list2";
    }

    @GetMapping
    public ModelAndView showListPage(Model model, @CookieValue(value = "productId",required = false,defaultValue = "-1")int id){
        model.addAttribute("historyProduct",productService.findById(id));
        return new ModelAndView("list","productList",productService.findAll());
    }

    @GetMapping("/add/{id}")
    public String getToCart(@PathVariable("id")int id, Model model, @ModelAttribute("cart")Cart cart){
        Product product = productService.findById(id);
        cart.addProduct(product);
        model.addAttribute("list",cart.getMap());
        model.addAttribute("cart",cart);
        return "cart";
    }
}
