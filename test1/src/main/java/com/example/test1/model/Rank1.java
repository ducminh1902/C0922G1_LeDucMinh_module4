package com.example.test1.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Rank1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id",nullable = false)
    private int id;

    private String level;

    @OneToMany(mappedBy = "rank1")
    private Set<Student> studentSet;


    public Rank1() {
    }

    public Rank1(int id, String level, Set<Student> studentSet) {
        this.id = id;
        this.level = level;
        this.studentSet = studentSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}
