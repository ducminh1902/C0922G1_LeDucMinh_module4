package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> display();

    void delete(int id);

    void add(Product product);

    Product findById(int id);

    List<Product> findByName(String name);

    void update(Product product);
}
