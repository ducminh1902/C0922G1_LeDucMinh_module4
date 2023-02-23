package com.example.demo1.service.contract;

import com.example.demo1.Reponsitory.contract.IContractReponsitory;
import com.example.demo1.model.Contract.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractReponsitory contractReponsitory;


    @Override
    public List<Contract> findAll() {
        return contractReponsitory.findAll();
    }

    @Override
    public Contract add(Contract contract) {
        return contractReponsitory.save(contract);
    }

    @Override
    public void delete(int id) {
        contractReponsitory.deleteById(id);
    }


}
