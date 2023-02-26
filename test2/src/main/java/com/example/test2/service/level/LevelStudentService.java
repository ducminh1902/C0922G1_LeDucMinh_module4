package com.example.test2.service.level;

import com.example.test2.model.LevelStudent;
import com.example.test2.model.Student;
import com.example.test2.repository.ILevelStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class LevelStudentService implements ILevelStudentService{

    @Autowired
    private ILevelStudentRepository levelStudentRepository;


    @Override
    public List<LevelStudent> findAll() {
        return levelStudentRepository.findAll();
    }


}
