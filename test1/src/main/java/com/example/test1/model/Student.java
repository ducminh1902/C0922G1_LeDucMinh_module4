package com.example.test1.model;

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
    private Rank1 rank1;

    public Student() {
    }

    public Student(int id, String name, String className, Rank1 rank1) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.rank1 = rank1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Rank1 getRank1() {
        return rank1;
    }

    public void setRank1(Rank1 rank1) {
        this.rank1 = rank1;
    }
}
