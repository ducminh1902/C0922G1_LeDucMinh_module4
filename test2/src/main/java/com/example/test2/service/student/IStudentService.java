package com.example.test2.service.student;

import com.example.test2.model.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> findAll();

    void delete(int id);

    void add(Student student);

    Student update(Student student);


    Optional<Student> findById(int id);

    List<Student> findByName(String name);
}
