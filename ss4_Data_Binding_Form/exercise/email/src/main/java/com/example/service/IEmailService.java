package com.example.service;

import com.example.model.Email;

import java.util.List;

public interface IEmailService {
    List<Email> display();

    Email findById(int id);

    boolean update(Email email);
}
