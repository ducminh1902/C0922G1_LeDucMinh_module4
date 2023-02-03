package com.example.service;

import com.example.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.reponsitory.IEmailReponsitory;

import java.util.List;

@Service
public class EmailService implements IEmailService{

    @Autowired
    private static IEmailReponsitory emailReponsitory;

    @Override
    public List<Email> display() {
        return emailReponsitory.display();
    }

    @Override
    public Email findById(int id) {
        return emailReponsitory.findById(id);
    }

    @Override
    public boolean update(Email email) {
        return emailReponsitory.update(email);
    }


}
