package com.dis.hrsystem.repository;

import com.dis.hrsystem.entity.Contract;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ContractRespository {
    public List<Contract> findByContract (@Param("num")Integer num);
}
