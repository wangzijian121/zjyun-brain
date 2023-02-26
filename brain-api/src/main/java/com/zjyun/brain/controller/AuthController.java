package com.zjyun.brain.controller;

import com.zjyun.brain.mapper.UserMapper;
import com.zjyun.brain.module.Auth;
import com.zjyun.brain.module.User;
import com.zjyun.brain.response.BaseApiResponse;
import com.zjyun.brain.service.IAuth;
import com.zjyun.brain.service.IBrain;
import com.zjyun.brain.service.IUser;
import com.zjyun.brain.service.impl.BrainImpl;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

/**
 * authentication
 *
 * @author zijian Wang
 */
@Api(tags = "brain-auth", protocols = "http")
@RestController
@RequestMapping(value = "/brain")
@Configuration
public class AuthController {


    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    private IBrain iBrain;
    @Autowired
    private IUser iUser;
    @Autowired
    private IAuth iAuth;

    /**
     * 验证user 的 token
     *
     * @return
     */
    @ApiOperation(value = "安装brain", notes = "通过验证token 安装brain")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "username", dataType = "string", paramType = "query", required = false),
            @ApiImplicitParam(name = "inputToken", value = "inputToken", dataType = "string", paramType = "query", required = false)
    })
    @ApiResponses({
            @ApiResponse(code = 100, message = "异常数据")
    })

    @RequestMapping(value = "/install", method = RequestMethod.POST)
    public String install(@RequestParam String username, @RequestParam String inputToken) {

        //验证是否过期
        //生成UUID,写入数据库。
        //返回UUID。
        User user = iUser.getUserByName(username);
        if (user != null) {
            Auth auth = iAuth.getTokenByUser(user);
            //使用Argon2Id校验
            if (iAuth.matchPasswordByArgon2Id(auth, inputToken)) {
                return "登录成功!";
            } else {
                return "登录失败!";
            }
        } else {
            return "用户未注册!";
        }

    }


}
