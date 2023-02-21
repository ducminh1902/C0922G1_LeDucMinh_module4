package com.example.demo1.service.customer;

import com.example.demo1.Reponsitory.customer.ICustomerTypeRepnsitory;
import com.example.demo1.model.customer.CustomerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService{
    @Autowired
    private ICustomerTypeRepnsitory customerTypeRepnsitory;
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepnsitory.findAll();
    }
}
