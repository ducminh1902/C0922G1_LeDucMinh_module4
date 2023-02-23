package com.example.demo1.service.contract;

import com.example.demo1.model.Contract.ContractDetail;

import java.util.List;
import java.util.Optional;

public interface IContractDetailService {
    List<ContractDetail> findAll();

    Optional<ContractDetail> findById(int id);

    void add(ContractDetail contractDetail);
}
