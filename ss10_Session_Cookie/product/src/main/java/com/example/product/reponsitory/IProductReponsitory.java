package com.example.product.reponsitory;

import com.example.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductReponsitory extends JpaRepository<Product,Integer> {
}
