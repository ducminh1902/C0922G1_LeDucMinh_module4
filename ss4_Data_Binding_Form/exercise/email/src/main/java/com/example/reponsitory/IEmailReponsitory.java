package com.example.reponsitory;

import com.example.model.Email;

import java.util.List;

public interface IEmailReponsitory {
    List<Email> display();

    Email findById(int id);

    boolean update(Email email);
}
