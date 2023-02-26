package com.example.demo2.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String rank;

    @OneToMany(mappedBy = "level")
    private Set<Student> studentSet;
}
