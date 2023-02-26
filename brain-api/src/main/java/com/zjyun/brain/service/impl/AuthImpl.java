package com.zjyun.brain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zjyun.brain.mapper.AuthMapper;
import com.zjyun.brain.mapper.UserMapper;
import com.zjyun.brain.module.Auth;
import com.zjyun.brain.module.User;
import com.zjyun.brain.service.IAuth;
import com.zjyun.brain.service.IUser;
import com.zjyun.brain.utils.Argon2PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthImpl implements IAuth {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private AuthMapper authMapper;

    @Override
    public Auth getTokenByUser(User user) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id", user.getId());
        return authMapper.selectOne(queryWrapper);
    }

    @Override
    public Boolean matchPasswordByArgon2Id(Auth auth,String inputToken) {
        String  token =auth.getToken();
        return Argon2PasswordEncoder.matches(token,inputToken);
    }

}
