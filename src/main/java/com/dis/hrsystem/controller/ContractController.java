package com.dis.hrsystem.controller;

import com.alibaba.druid.util.StringUtils;
import com.dis.hrsystem.entity.Contract;
import com.dis.hrsystem.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class ContractController {

    @Autowired
    ContractService contractService;

    @PostMapping("/findByContract")
    public List<Contract> findByContract (@RequestBody Map<String,String> data) {
        System.out.println("data : " + data.get("key1"));
        Integer num = null;
        if (!StringUtils.isEmpty(data.get("key1"))) {
            num = Integer.parseInt(data.get("key1"));
        }
        List<Contract>list = contractService.findByContract(num);

        for (int i = 0; i < list.size(); i++) {
            Contract ct = list.get(i);
            System.out.println(ct);
        }
        return list;
    }
}
