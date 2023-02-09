package com.example.demo1.reponsitory;

import com.example.demo1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserReponsitory extends JpaRepository<User,Integer> {
}
