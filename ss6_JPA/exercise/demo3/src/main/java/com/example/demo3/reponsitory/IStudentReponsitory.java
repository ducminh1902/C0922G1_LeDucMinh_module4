package com.example.demo3.reponsitory;

import com.example.demo3.model.Student;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentReponsitory extends JpaRepository<Student,Integer> {
}
