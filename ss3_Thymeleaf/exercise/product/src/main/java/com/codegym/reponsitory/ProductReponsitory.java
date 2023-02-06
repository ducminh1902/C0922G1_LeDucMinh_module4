package com.codegym.reponsitory;

import com.codegym.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductReponsitory implements IProductReponsitory {


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Product> display() {
        List<Product> productList = null;
        productList = entityManager.createQuery("FROM Product").getResultList();
        return productList;
    }

    @Override
    @Transactional
    public void delete(int id) {
//        for (int i = 0; i <productList.size() ; i++) {
//          if (id == productList.get(i).getId()){
//              productList.remove(i);
//              break;
//          }
//        }

//        for (Product p:display()) {
//            if (p.getId() == id){
//            display().remove(p);
//            break;
//            }
//        }

        Product product1 = entityManager.find(Product.class, id);
        entityManager.remove(product1);
    }

    @Override
    @Transactional
    public void add(Product product) {
        entityManager.persist(product);
    }

    @Override
    public Product findById(int id) {
//        for (Product p: display()) {
//            if (p.getId() == id){
//                return p;
//            }
//        }
        return entityManager.find(Product.class, id);
    }

    @Override
    @Transactional
    public void update(Product product) {
       Product product1 = findById(product.getId());
       product1.setName(product.getName());
       product1.setBrand(product.getBrand());
       product1.setDescribe(product.getDescribe());
       entityManager.merge(product1);
    }

    @Override
    public List<Product> findByName(String name) {
        return entityManager.createQuery("select p from Product p where p.name like :name ")
                .setParameter("name",'%'+name+'%').getResultList();
    }


}
