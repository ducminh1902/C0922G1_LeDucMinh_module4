package com.example.demo1.controller;

import com.example.demo1.dto.CustomerDto;
import com.example.demo1.model.customer.Customer;
import com.example.demo1.service.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customer")
    public String showList(Model model, @PageableDefault (size = 3,page = 0)Pageable pageable){
        Page<Customer> customerPage = customerService.findAll(pageable);
        model.addAttribute("list",customerPage);
        return "list";
    }

    @GetMapping("/showForm")
    private String showForm(Model model){
        model.addAttribute("customer",new Customer());
        return "create";
    }

    @PostMapping("/add")
    public String add(Model model, @Validated @ModelAttribute("customer") CustomerDto customerDto,
                      BindingResult bindingResult, RedirectAttributes redirects){
        if (bindingResult.hasErrors()){
       model.addAttribute("customerDto",customerDto);
       return "create";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        customerService.add(customer);
        redirects.addFlashAttribute("mess","Them moi thanh cong");
        return "redirect:/customer";
    }

    @GetMapping("/delete/{id}")
    public String delete(Model model,@PathVariable int id){
        customerService.delete(id);
        model.addAttribute("list",customerService.findAll(Pageable.unpaged()));
        return "list";
    }

    @GetMapping("/showFormEdit/{id}")
    public String showFormEdit(Model model,@PathVariable int id){
      Optional<Customer> customer = customerService.findById(id);
      model.addAttribute("customer",customer);
      return "edit";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model,@PathVariable int id){
        Optional<Customer> customer1 = customerService.findById(id);
        model.addAttribute("customer1",customer1);
        return "detail";
    }


    @GetMapping("/search")
    public String search(Model model, @RequestParam String name,@RequestParam int gender,@RequestParam String address){
        List<Customer> customer = customerService.findByNameGender(name,gender,address);
        model.addAttribute("list2",customer);
        return "list2";
    }
}
