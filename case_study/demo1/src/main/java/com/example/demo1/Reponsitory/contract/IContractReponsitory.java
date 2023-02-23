package com.example.demo1.Reponsitory.contract;

import com.example.demo1.model.Contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractReponsitory extends JpaRepository<Contract,Integer> {
}
