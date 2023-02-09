package com.example.demo1.service;

import com.example.demo1.model.User;
import com.example.demo1.reponsitory.IUserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserReponsitory userReponsitory;

    @Override
    public List<User> findAll() {
        return userReponsitory.findAll();
    }

    @Override
    public void add(User user) {
        userReponsitory.save(user);
    }
}
