package com.dis.hrsystem.repository;

import com.dis.hrsystem.entity.EmployeeDto;
import com.dis.hrsystem.entity.EmployeeParameter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeRepository {

    public List<EmployeeDto> getUsers(EmployeeParameter parameter);


}
