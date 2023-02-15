package com.codegym.demo1.controller.blog;

import com.codegym.demo1.model.Blog;
import com.codegym.demo1.service.blog.impl.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/blog")
public class BlogRestController {

    @Autowired
    private IBlogService blogService;

    @GetMapping("/blog")
    public ResponseEntity<Page<Blog>> findAll(Pageable pageable){
        Page<Blog> blogList = blogService.findAll(pageable);
        if (blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/view/{id}")
    public ResponseEntity<Blog> findById(@PathVariable int id){
        Blog blog = blogService.findByID(id);
        if (blog == null){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
