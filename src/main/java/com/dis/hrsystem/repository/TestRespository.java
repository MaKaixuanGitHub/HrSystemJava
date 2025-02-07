package com.dis.hrsystem.repository;

import com.dis.hrsystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TestRespository {
    public User findUserById(@Param("id") String id);

    public List<User> getUsers();

    public int deleteById(@Param("id") int id);

    public int updateById(User user);

    public int insertCity(User user);
}
