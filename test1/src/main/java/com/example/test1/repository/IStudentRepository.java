package com.example.test1.repository;

import com.example.test1.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student,Integer> {
    @Query(value = "select * from student where name like concat('%',:name,'%') and  student_point like concat('%',:rank1,'%') ",nativeQuery = true)
    List<Student> search(@Param("name") String name,@Param("rank1") String rank1);


}
