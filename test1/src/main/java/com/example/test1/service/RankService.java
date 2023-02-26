package com.example.test1.service;

import com.example.test1.model.Rank1;
import com.example.test1.repository.IRankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankService implements IRankService{

    @Autowired
    private IRankRepository rankRepository;

    @Override
    public List<Rank1> findAll() {
        return rankRepository.findAll();
    }
}
