package com.example.demo1.Reponsitory;

import com.example.demo1.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ICustomerReponsitory extends JpaRepository<Customer,Integer> {
    @Query(value = "select * from customer where name like :name and gender like :gender and address like :address", nativeQuery = true)
    List<Customer> search(@Param("name") String name, @Param("gender") int gender, @Param("address") String address);

    Page<Customer> findAll(Pageable pageable);

}
