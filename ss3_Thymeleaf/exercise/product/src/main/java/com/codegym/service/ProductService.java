package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.reponsitory.IProductReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    IProductReponsitory productReponsitory;


    @Override
    public List<Product> display() {
        return productReponsitory.display();
    }

    @Override
    public void delete(int id) {
        productReponsitory.delete(id);
    }

    @Override
    public void add(Product product) {
        productReponsitory.add(product);
    }


}
