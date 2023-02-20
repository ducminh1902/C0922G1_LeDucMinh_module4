package com.example.demo1.Reponsitory;

import com.example.demo1.model.customer.Customer;
import com.example.demo1.model.customer.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ICustomerReponsitory extends JpaRepository<Customer,Integer> {
    @Query(value = "select * from customer where name like concat ('%',:name,'%') and email like concat ('%',:email,'%') and customer_type_id like concat ('%',:customerTypeId,'%') ", nativeQuery = true)
    List<Customer> search(@Param("name") String name, @Param("email") String email, @Param("customerTypeId") String customerTypeId);

    Page<Customer> findAll(Pageable pageable);


}
