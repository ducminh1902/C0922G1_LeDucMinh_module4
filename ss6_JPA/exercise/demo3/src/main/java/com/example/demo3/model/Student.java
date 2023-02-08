package com.example.demo3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   private String name;
   private int gender;
   private String classname;

    public Student() {
    }


    public Student(int id, String name, int gender, String classname) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.classname = classname;
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
