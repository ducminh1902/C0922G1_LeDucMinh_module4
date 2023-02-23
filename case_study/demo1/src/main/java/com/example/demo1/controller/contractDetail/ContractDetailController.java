package com.example.demo1.controller.contractDetail;

import com.example.demo1.model.Contract.ContractDetail;
import com.example.demo1.service.contract.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("contractDetail")
public class ContractDetailController {
    @Autowired
    private IContractDetailService contractDetailService;

    @GetMapping("")
    public String show(Model model){
        model.addAttribute("list",contractDetailService.findAll());
        return "detail/detail";
    }

    @GetMapping("showDetail{id}")
    public String showList(Model model, @PathVariable int id){
        ContractDetail contractDetail = contractDetailService.findById(id).get();
        model.addAttribute("list2",contractDetail);
        return "detail/detail";
    }
}
