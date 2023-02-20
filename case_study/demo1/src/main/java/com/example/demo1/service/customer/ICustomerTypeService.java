package com.example.demo1.service.customer;

import com.example.demo1.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
