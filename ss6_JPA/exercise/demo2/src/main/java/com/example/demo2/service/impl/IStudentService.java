package com.example.demo2.service.impl;

import com.example.demo2.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void delete(int id);

    Student add(Student student);
}
