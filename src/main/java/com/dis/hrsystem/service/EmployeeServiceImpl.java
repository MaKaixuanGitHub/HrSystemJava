package com.dis.hrsystem.service;

import com.dis.hrsystem.entity.EmployeeDto;
import com.dis.hrsystem.entity.EmployeeParameter;
import com.dis.hrsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    /**
     * 根据ID获取用户信息
     * @param parameter
     * @return
     */
    @Override
    public List<EmployeeDto> getUsers (EmployeeParameter parameter) {
        return (List<EmployeeDto>) employeeRepository.getUsers(parameter);
    }
}
