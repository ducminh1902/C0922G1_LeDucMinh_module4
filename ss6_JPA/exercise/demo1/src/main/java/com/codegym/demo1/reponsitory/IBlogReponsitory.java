package com.codegym.demo1.reponsitory;


import com.codegym.demo1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogReponsitory extends JpaRepository<Blog,Integer> {

   Page<Blog> findByTitleContaining (String title, Pageable pageable);
}
