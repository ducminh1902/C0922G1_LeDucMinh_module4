package com.codegym.reponsitory;

import com.codegym.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductReponsitory implements IProductReponsitory {
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1,"shirt","adidas","good"));
        productList.add(new Product(2,"jacket","adidas","good"));
        productList.add(new Product(3,"hat","adidas","good"));
        productList.add(new Product(4,"short","adidas","good"));
        productList.add(new Product(5,"shoes","adidas","good"));
    }


    @Override
    public List<Product> display() {
        return productList;
    }

    @Override
    public void delete(int id) {
//        for (int i = 0; i <productList.size() ; i++) {
//          if (id == productList.get(i).getId()){
//              productList.remove(i);
//              break;
//          }
//        }
        for (Product p:productList) {
            if (p.getId() == id){
            productList.remove(p);
            break;
            }
        }
    }

    @Override
    public void add(Product product) {
       productList.add(product);
    }


}
