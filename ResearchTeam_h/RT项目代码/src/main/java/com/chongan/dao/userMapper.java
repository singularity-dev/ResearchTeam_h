package com.chongan.dao;

import com.chongan.pojo.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper {
    public user getUserbyName(String username);

    public int deletebyName(String username);
    public int addUser(user myUser);
}
