package com.example.demo1.Reponsitory.contract;

import com.example.demo1.model.Contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractDetailReponsitory extends JpaRepository<ContractDetail,Integer> {
}
