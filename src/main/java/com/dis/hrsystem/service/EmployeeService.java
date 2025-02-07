package com.dis.hrsystem.service;

import com.dis.hrsystem.entity.EmployeeDto;
import com.dis.hrsystem.entity.EmployeeParameter;
import com.dis.hrsystem.entity.User;

import java.util.List;

public interface EmployeeService {
    //public EmployeeList findUser (EmployeeParameter id);
    public List<EmployeeDto> getUsers (EmployeeParameter parameter);
}
