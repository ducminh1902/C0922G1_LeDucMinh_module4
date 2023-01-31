package controller;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EnglishController {
    @GetMapping("/translate")
    public String showForm(){
        return "main";
    }

    @PostMapping("/translate")
    public String translate(@RequestParam String english, Model model){
       String result = null;
       switch (english){
           case "hello":
               result = "xin chào";
               break;
           case "goodbye":
               result = "tạm biệt";
               break;
           default:
               result = "không tìm thấy";
               break;
       }
       model.addAttribute("result",result);
       return "main";
    }
}
