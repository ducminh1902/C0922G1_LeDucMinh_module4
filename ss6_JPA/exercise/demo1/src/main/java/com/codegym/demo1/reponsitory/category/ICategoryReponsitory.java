package com.codegym.demo1.reponsitory.category;

import com.codegym.demo1.model.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryReponsitory extends JpaRepository<Category,Integer> {

}
