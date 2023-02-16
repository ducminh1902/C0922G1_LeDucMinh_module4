package com.codegym.demo1.controller.blog;

import com.codegym.demo1.model.Blog;
import com.codegym.demo1.service.blog.impl.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/blog")
public class BlogRestController {

    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public ResponseEntity<Page<Blog>> findAll(Pageable pageable,@RequestParam(required = false,defaultValue = "")String title, Model model){
        Page<Blog> blogList = blogService.findByName(title,pageable);
        model.addAttribute("title",title);
        model.addAttribute("blogList",blogList);
        if (blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<Blog> findById(@PathVariable int id){
        Blog blog = blogService.findByID(id);
        if (blog == null){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }


//    @GetMapping("/search/{title}")
//    public ResponseEntity<Page<Blog>> findByName(Model model,@PathVariable("title") String title,Pageable pageable){
//        Page<Blog> blogSearch = blogService.findByName(title,pageable);
//        model.addAttribute("blogSearch",blogSearch);
//        if (blogSearch.isEmpty()){
//            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(blogSearch,HttpStatus.OK);
//    }
}
