package com.example.demo1.service.customer;

import com.example.demo1.Reponsitory.customer.ICustomerReponsitory;
import com.example.demo1.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerReponsitory customerReponsitory;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerReponsitory.findAll(pageable);
    }

    @Override
    public List<Customer> findAll1() {
        return customerReponsitory.findAll();
    }

    @Override
    public void add(Customer customer) {
      customerReponsitory.save(customer);
    }

    @Override
    public Optional<Customer> findById(int id) {
        return customerReponsitory.findById(id);
    }

    @Override
    public void delete(int id) {
        customerReponsitory.deleteById(id);
    }

    @Override
    public void update(Customer customer) {
        customerReponsitory.save(customer);
    }

    @Override
    public List<Customer> findByNameGender(String name, String email, String customerTypeId) {
        return customerReponsitory.search(name, email, customerTypeId);
    }


}
