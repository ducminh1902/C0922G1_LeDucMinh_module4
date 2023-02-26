package com.example.test2.repository;

import com.example.test2.model.LevelStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILevelStudentRepository extends JpaRepository<LevelStudent,Integer> {
}
