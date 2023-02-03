package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> display();

    void delete(int id);

    void add(Product product);
}
