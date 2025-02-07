package com.dis.hrsystem.controller;

import com.dis.hrsystem.entity.EmployeeDto;
import com.dis.hrsystem.entity.EmployeeParameter;
import com.dis.hrsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:8092/")
public class EmployeeListController {

    @Autowired
    EmployeeService employeeService;


    @PostMapping("/employeeSearch")
    public List<EmployeeDto> employeeSearch(@RequestBody EmployeeParameter parameter) {

        List<EmployeeDto> dto = employeeService.getUsers(parameter);



        return dto;





    }

}
