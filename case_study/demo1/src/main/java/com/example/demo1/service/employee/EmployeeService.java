package com.example.demo1.service.employee;

import com.example.demo1.Reponsitory.employee.IEmployeeReponsitory;
import com.example.demo1.model.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeReponsitory employeeReponsitory;

    @Override
    public List<Employee> findAll() {
        return employeeReponsitory.findAll();
    }
}
