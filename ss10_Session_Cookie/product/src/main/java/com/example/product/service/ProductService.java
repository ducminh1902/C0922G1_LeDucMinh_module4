package com.example.product.service;

import com.example.product.model.Product;
import com.example.product.reponsitory.IProductReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductReponsitory productReponsitory;


    @Override
    public List<Product> findAll() {
        return productReponsitory.findAll();
    }

    @Override
    public Product findById(int id) {
        return productReponsitory.findById(id).get();
    }
}
