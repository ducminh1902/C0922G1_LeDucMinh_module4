package com.example.demo1.Reponsitory;

import com.example.demo1.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepnsitory extends JpaRepository<CustomerType,Integer> {
}
