package com.example.demo1.Reponsitory.employee;

import com.example.demo1.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeReponsitory extends JpaRepository<Employee,Integer> {
}
