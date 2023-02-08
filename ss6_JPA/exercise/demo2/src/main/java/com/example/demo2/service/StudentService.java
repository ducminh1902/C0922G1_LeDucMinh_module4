package com.example.demo2.service;

import com.example.demo2.model.Student;
import com.example.demo2.reponsitory.IStudentReponsitory;
import com.example.demo2.service.impl.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    IStudentReponsitory studentReponsitory;

    @Override
    public List<Student> findAll() {
        return studentReponsitory.findAll();
    }

    @Override
    public void delete(int id) {
        studentReponsitory.deleteById(id);
    }

    @Override
    public Student add(Student student) {
        return studentReponsitory.save(student);
    }


}
