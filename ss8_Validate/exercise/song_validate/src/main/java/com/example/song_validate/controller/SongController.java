package com.example.song_validate.controller;

import com.example.song_validate.dto.SongDto;
import com.example.song_validate.model.Song;
import com.example.song_validate.service.impl.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping("/song")
    public String showList(Model model){
        model.addAttribute("list",songService.findAll());
        return "list";
    }

    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("song",new Song());
        return "create";
    }

    @PostMapping("/create")
    public  String create(Model model, @Validated @ModelAttribute SongDto songDto,
                          BindingResult bindingResult, RedirectAttributes redirects){

        if (bindingResult.hasErrors()){
         model.addAttribute("songDto",songDto);
         return "create";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDto,song);
        songService.add(song);
        redirects.addFlashAttribute("mess", "Thêm mới thành công");
        return "list";
    }
}
