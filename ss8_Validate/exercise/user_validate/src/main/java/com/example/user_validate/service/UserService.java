package com.example.user_validate.service;

import com.example.user_validate.model.User;
import com.example.user_validate.reponsitory.IUserReponsitory;
import com.example.user_validate.service.impl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserReponsitory userReponsitory;

    @Override
    public List<User> findAll() {
        return userReponsitory.findAll();
    }

    @Override
    public User add(User user) {
        return userReponsitory.save(user);
    }
}
