package com.example.demo1.model.User;

import com.example.demo1.model.employee.Employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    private String userName;
    private String passWord;

    @OneToMany(mappedBy = "user")
    private Set<Employee> employeeSet;


    @ManyToMany
    @JoinTable(name = "role_user",joinColumns = @JoinColumn(name = "userName"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
   private Set<Role> roleSet;
}
