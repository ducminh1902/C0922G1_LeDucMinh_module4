package com.example.demo1.model.User;

import org.springframework.data.domain.Page;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;
    private String roleName;

    @ManyToMany(mappedBy = "roleSet")
    private Set<User> userSet;


}
