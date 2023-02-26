package com.zjyun.brain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zjyun.brain.mapper.AuthMapper;
import com.zjyun.brain.module.Message;
import com.zjyun.brain.service.IBrain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrainImpl implements IBrain {

    private ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    private AuthMapper authMapper;

    @Override
    public String recall(String keywords) {

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id", 1);
        return authMapper.selectList(queryWrapper).toString();
    }

    @Override
    public void remember(Message message) {

    }

    @Override
    public String getBrainInfo() {
        return null;
    }
}
