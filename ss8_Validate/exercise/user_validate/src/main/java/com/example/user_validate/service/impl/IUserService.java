package com.example.user_validate.service.impl;

import com.example.user_validate.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

   User add(User user);
}
