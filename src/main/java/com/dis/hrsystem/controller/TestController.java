package com.dis.hrsystem.controller;

import com.dis.hrsystem.entity.User;
import com.dis.hrsystem.service.TestService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:5173/")
public class TestController {

    @Autowired
    TestService testService;

    /**
     * test helloworld
     * @return "Hello World!"
     */
    @GetMapping("/hello")
    public String helloWorld () {
        return "Hello World!";
    }

    /**
     * 根据iD查询
     * @param id
     * @return
     */
    @GetMapping("/findById")
    public User findById(@RequestParam("id") String id) {
        return testService.findUserById(id);
    }
}
