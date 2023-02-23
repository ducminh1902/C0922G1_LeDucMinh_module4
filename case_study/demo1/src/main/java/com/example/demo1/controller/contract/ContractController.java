package com.example.demo1.controller.contract;

import com.example.demo1.model.Contract.Contract;
import com.example.demo1.service.contract.IContractService;
import com.example.demo1.service.customer.ICustomerService;
import com.example.demo1.service.employee.IEmployeeService;
import com.example.demo1.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("contract")
public class ContractController {
    @Autowired
    private IContractService contractService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IFacilityService facilityService;
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("list",contractService.findAll());
        return "contract/list";
    }

    @GetMapping("showForm")
    public String showForm(Model model){
        model.addAttribute("contract",new Contract());
        model.addAttribute("customer",customerService.findAll1());
        model.addAttribute("employee",employeeService.findAll());
        model.addAttribute("facility",facilityService.findAll1());
        return "contract/create";
    }

    @PostMapping("add")
    public String add(Model model, @ModelAttribute("contract") Contract contract){
        contractService.add(contract);
        model.addAttribute("list",contractService.findAll());
        return "redirect:/contract";
    }

    @GetMapping("delete/{id}")
    public  String delete(Model model, @PathVariable int id){
        contractService.delete(id);
        model.addAttribute("list",contractService.findAll());
        return "contract/list";
    }

}
