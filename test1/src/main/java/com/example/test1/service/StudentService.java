package com.example.test1.service;

import com.example.test1.model.Student;
import com.example.test1.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService{
    @Autowired
    private IStudentRepository studentRepository;


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void add(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void delete(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void update(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Optional<Student> finfdById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> search(String name, String rank1) {
        return studentRepository.search(name,rank1);
    }
}
