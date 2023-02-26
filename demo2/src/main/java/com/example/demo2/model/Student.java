package com.example.demo2.model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String name;

    private String className;

    @ManyToOne
    @JoinColumn(name = "student_point",referencedColumnName = "id")
    private Level level;
}
