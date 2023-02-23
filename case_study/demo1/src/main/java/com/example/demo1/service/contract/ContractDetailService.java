package com.example.demo1.service.contract;

import com.example.demo1.Reponsitory.contract.IContractDetailReponsitory;
import com.example.demo1.model.Contract.ContractDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractDetailService implements IContractDetailService{

    @Autowired
    private IContractDetailReponsitory contractDetailReponsitory;

    @Override
    public List<ContractDetail> findAll() {
        return contractDetailReponsitory.findAll();
    }

    @Override
    public Optional<ContractDetail> findById(int id) {
        return contractDetailReponsitory.findById(id);
    }

    @Override
    public void add(ContractDetail contractDetail) {
         contractDetailReponsitory.save(contractDetail);
    }
}
