package com.codegym.reponsitory;

import com.codegym.model.Product;

import java.util.List;

public interface IProductReponsitory {
    List<Product> display();


    void delete(int id);

    void add(Product product);

}
