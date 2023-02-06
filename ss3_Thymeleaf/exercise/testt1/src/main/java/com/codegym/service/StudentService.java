package com.codegym.service;

import com.codegym.model.Student;
import com.codegym.reponsitory.IStudentReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{

    @Autowired
    IStudentReponsitory studentReponsitory;


    @Override
    public List<Student> display() {
        return studentReponsitory.display() ;
    }
}
