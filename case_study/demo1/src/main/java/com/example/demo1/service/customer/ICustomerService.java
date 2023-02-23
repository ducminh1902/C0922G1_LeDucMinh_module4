package com.example.demo1.service.customer;

import com.example.demo1.model.customer.Customer;
import com.example.demo1.model.customer.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    List<Customer> findAll1();
    void add(Customer customer);

    Optional<Customer> findById(int id);

    void delete(int id);

    void update(Customer customer);

    List<Customer> findByNameGender(String name, String email, String customerTypeId);
}
