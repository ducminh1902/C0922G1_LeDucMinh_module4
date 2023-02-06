package com.codegym.reponsitory;

import com.codegym.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentReponsitory implements IStudentReponsitory{
    static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1,"Minh",1,"A1"));
        studentList.add(new Student(2,"Cường",1,"A1"));
        studentList.add(new Student(3,"Lan",1,"A1"));
        studentList.add(new Student(4,"Diễm",1,"A1"));
        studentList.add(new Student(5,"Phúc",1,"A1"));
        studentList.add(new Student(6,"Tân",1,"A1"));
    }



    @Override
    public List<Student> display() {
        return studentList;
    }
}
