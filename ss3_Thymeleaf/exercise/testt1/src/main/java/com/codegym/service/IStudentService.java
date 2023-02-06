package com.codegym.service;

import com.codegym.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentService {
    List<Student> display();
}
