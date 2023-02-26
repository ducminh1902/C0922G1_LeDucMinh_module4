package com.example.test1.service;

import com.example.test1.model.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> findAll();

    void add(Student student);


    void delete(int id);

    void update(Student student);

    Optional<Student> finfdById(int id);

    List<Student> search(String name,String rank1);
}
