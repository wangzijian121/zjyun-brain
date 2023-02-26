package com.zjyun.brain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zjyun.brain.mapper.AuthMapper;
import com.zjyun.brain.mapper.UserMapper;
import com.zjyun.brain.module.Message;
import com.zjyun.brain.module.User;
import com.zjyun.brain.service.IBrain;
import com.zjyun.brain.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements IUser {

    private ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserByName(String username) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username", username);
        return userMapper.selectOne(queryWrapper);
    }
}
