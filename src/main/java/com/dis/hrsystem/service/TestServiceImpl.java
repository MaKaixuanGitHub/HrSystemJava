package com.dis.hrsystem.service;

import com.dis.hrsystem.entity.User;
import com.dis.hrsystem.repository.TestRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{
    @Autowired
    TestRespository testRespository;

    /**
     * 根据ID获取用户信息
     * @param id
     * @return
     */
    @Override
    public User findUserById (String id) {
        return testRespository.findUserById(id);
    }
}
