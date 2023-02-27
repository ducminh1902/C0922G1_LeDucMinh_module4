package com.example.demo1.controller.customer;

import com.example.demo1.dto.CustomerDto;
import com.example.demo1.model.customer.Customer;
import com.example.demo1.model.customer.CustomerType;
import com.example.demo1.service.customer.CustomerService;
import com.example.demo1.service.customer.ICustomerService;
import com.example.demo1.service.customer.ICustomerTypeService;
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
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping("")
    public String showList(Model model, @PageableDefault (size = 3,page = 0)Pageable pageable){
        Page<Customer> customerPage = customerService.findAll(pageable);
        model.addAttribute("list",customerPage);
        model.addAttribute("customerTypeList",customerTypeService.findAll());
        return "customer/list";
    }

    @GetMapping("/showForm")
    private String showForm(Model model){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setCustomerType(new CustomerType());
        model.addAttribute("customerDto", customerDto);
        return "customer/create";
    }


    @PostMapping("/add")
    public String add(Model model, @Validated @ModelAttribute CustomerDto customerDto, @PageableDefault Pageable pageable, BindingResult bindingResult, RedirectAttributes redirects){
        if (bindingResult.hasErrors()){
           model.addAttribute("CustomerDto",customerDto);
           return "customer/create";
        }
          Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        customerService.add(customer);
//        model.addAttribute("list",customerService.findAll(pageable));
        redirects.addFlashAttribute("mess","thêm mới thành công");
        return "redirect:/customer";
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
        model.addAttribute("customerTypeList",customerTypeService.findAll());
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
