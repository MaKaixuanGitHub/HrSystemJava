package com.dis.hrsystem.service;

import com.dis.hrsystem.entity.Contract;
import com.dis.hrsystem.repository.ContractRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService{

    @Autowired
    ContractRespository contractRespository;

    @Override
    public List<Contract> findByContract(Integer num) {
        return contractRespository.findByContract(num);
    }
}
