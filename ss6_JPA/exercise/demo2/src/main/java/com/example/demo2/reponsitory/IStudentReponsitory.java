package com.example.demo2.reponsitory;

import com.example.demo2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentReponsitory extends JpaRepository<Student,Integer> {

}
