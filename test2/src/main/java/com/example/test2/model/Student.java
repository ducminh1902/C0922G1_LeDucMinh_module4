package com.example.test2.model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private  String className;

    @ManyToOne
    @JoinColumn(name = "student_score" ,referencedColumnName = "score")
    private LevelStudent levelStudent;

    public Student() {
    }

    public Student(int id, String name, String className, LevelStudent levelStudent) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.levelStudent = levelStudent;
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

    public LevelStudent getLevelStudent() {
        return levelStudent;
    }

    public void setLevelStudent(LevelStudent levelStudent) {
        this.levelStudent = levelStudent;
    }
}
