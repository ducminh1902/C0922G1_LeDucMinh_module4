package com.example.demo1.service.contract;

import com.example.demo1.model.Contract.Contract;

import java.util.List;
import java.util.Optional;

public interface IContractService {
    List<Contract> findAll();

    Contract add(Contract contract);

    void delete(int id);



}
