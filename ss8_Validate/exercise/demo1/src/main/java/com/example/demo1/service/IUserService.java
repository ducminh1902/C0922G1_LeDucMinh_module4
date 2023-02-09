package com.example.demo1.service;

import com.example.demo1.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    void  add(User user);
}
