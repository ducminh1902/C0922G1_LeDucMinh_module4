package com.example.test2.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class LevelStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int score;

    private String level;

    @OneToMany(mappedBy = "levelStudent")
    private Set<Student> studentSet;

    public LevelStudent() {
    }

    public LevelStudent(int score, String level, Set<Student> studentSet) {
        this.score = score;
        this.level = level;
        this.studentSet = studentSet;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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
