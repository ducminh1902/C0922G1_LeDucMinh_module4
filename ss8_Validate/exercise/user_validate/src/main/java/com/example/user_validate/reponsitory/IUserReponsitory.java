package com.example.user_validate.reponsitory;

import com.example.user_validate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserReponsitory extends JpaRepository<User,Integer> {

}
