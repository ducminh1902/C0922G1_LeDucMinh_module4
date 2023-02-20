package com.example.demo1.controller.customer;

import com.example.demo1.model.customer.Customer;
import com.example.demo1.model.customer.CustomerType;
import com.example.demo1.service.customer.ICustomerService;
import com.example.demo1.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping("/customer")
    public String showList(Model model, @PageableDefault (size = 3,page = 0)Pageable pageable){
        Page<Customer> customerPage = customerService.findAll(pageable);
        model.addAttribute("list",customerPage);
        model.addAttribute("customerTypeList",customerTypeService.findAll());
        return "customer/list";
    }

    @GetMapping("/showForm")
    private String showForm(Model model){
        Customer customer = new Customer();
        customer.setCustomerType(new CustomerType());
        model.addAttribute("customer", customer);
        return "customer/create";
    }


    @PostMapping("/add")
    public String add(Model model,@ModelAttribute("customer") Customer customer,@PageableDefault Pageable pageable){
        customerService.add(customer);
        model.addAttribute("list",customerService.findAll(pageable));
        return "customer/list";
    }
    @GetMapping("/delete/{id}")
    public String delete(Model model,@PathVariable int id,@PageableDefault Pageable pageable){
        customerService.delete(id);
        model.addAttribute("list",customerService.findAll(pageable));
        return "customer/list";
    }

    @GetMapping("/showFormEdit/{id}")
    public String showFormEdit(Model model,@PathVariable int id){
     Customer customer = customerService.findById(id).get();
      model.addAttribute("customer",customer);
      return "customer/edit";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model,@PathVariable int id){
        Customer customer1 = customerService.findById(id).get();
        model.addAttribute("list2",customer1);
        return "customer/list2";
    }


    @GetMapping("/search")
    public String search(Model model, @RequestParam String name,@RequestParam String email,@RequestParam String customerType){
        List<Customer> customer = customerService.findByNameGender(name,email,customerType);
        model.addAttribute("list3",customer);
        return "customer/search";
    }
}
