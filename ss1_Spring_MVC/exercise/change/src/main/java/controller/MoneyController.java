package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyController {

    @GetMapping("/change")
     public String showForm(){
        return "main";
    }

    @PostMapping("/change")
    public String change(@RequestParam double USD, Model model){
       double vnd = USD * 23.000;
       model.addAttribute("vnd",vnd);
        return "main";
    }
}
