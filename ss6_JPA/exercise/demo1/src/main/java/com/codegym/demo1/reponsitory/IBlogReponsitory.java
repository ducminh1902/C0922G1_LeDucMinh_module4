package com.codegym.demo1.reponsitory;


import com.codegym.demo1.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogReponsitory extends JpaRepository<Blog,Integer> {


}
