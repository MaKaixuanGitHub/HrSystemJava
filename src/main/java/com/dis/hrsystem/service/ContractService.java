package com.dis.hrsystem.service;

import com.dis.hrsystem.entity.Contract;

import java.util.List;

public interface ContractService {
    public List<Contract> findByContract (Integer num);
}
