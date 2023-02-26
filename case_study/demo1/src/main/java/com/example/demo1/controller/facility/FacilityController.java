package com.example.demo1.controller.facility;

import com.example.demo1.model.facility.Facility;
import com.example.demo1.model.facility.FacilityType;
import com.example.demo1.model.facility.RentType;
import com.example.demo1.service.facility.IFacilityService;
import com.example.demo1.service.facility.IFacilityTypeService;
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
@RequestMapping("facility")
public class FacilityController {

    @Autowired
    private IFacilityService facilityService;

    @Autowired
    private IFacilityTypeService facilityTypeService;

    @GetMapping("")
    public String showList(Model model, @PageableDefault(size = 2,page = 0)Pageable pageable){
        Page<Facility> facilityList= facilityService.findAll(pageable);
        model.addAttribute("list",facilityList);
        model.addAttribute("facilityTypeList",facilityTypeService.findAll());
        return "facility/list";
    }

    @GetMapping("/showForm")
    public String showForm(Model model){
        Facility facility = new Facility();
        facility.setFacilityType(new FacilityType());
        facility.setRentType(new RentType());
        model.addAttribute("facility",facility);
        return "facility/create";
    }

    @PostMapping("/add")
    public String add(Model model,@ModelAttribute("facility") Facility facility,@PageableDefault Pageable pageable ){
        facilityService.add(facility);
        model.addAttribute("list",facilityService.findAll(pageable));
        model.addAttribute("facilityTypeList",facilityTypeService.findAll());
        return "facility/list";
    }


    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable int id,@PageableDefault Pageable pageable){
        facilityService.delete(id);
        model.addAttribute("list",facilityService.findAll(pageable));
        model.addAttribute("facilityTypeList",facilityTypeService.findAll());
        return"facility/list";
    }

    @GetMapping("showFormEdit/{id}")
    public String showFormEdit(Model model,@PathVariable int id){
        Facility facility = facilityService.findById(id).get();
        model.addAttribute("facilityTypeList",facilityTypeService.findAll());
        model.addAttribute("facility",facility);
        return "facility/edit";
    }

    @GetMapping("/search")
    public String search(Model model,@RequestParam String name , @RequestParam String facilityType){
        List<Facility> facilityList = facilityService.search(name,facilityType);
        model.addAttribute("facilityTypeList",facilityTypeService.findAll());
        model.addAttribute("list3",facilityList);
        return "facility/search";
    }
}
