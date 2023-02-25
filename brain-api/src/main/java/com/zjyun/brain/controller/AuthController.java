package com.zjyun.brain.controller;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * authentication
 *
 * @author zijian Wang
 */
@Api(tags = "brain-auth", protocols = "http")
@RestController
@RequestMapping(value = "/brain/")

@Configuration
public class AuthController {


    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    /**
     * 验证user 的 token
     *
     * @return
     */
    @ApiOperation(value = "安装brain", notes = "通过验证token 安装brain")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "username", dataType = "string", paramType = "query", required = false),
            @ApiImplicitParam(name = "token", value = "token", dataType = "string", paramType = "query", required = false)
    })
    @ApiResponses({
            @ApiResponse(code = 100, message = "异常数据")
    })
    @ResponseBody
    @RequestMapping(value = "/install", method = RequestMethod.POST)
    public String install(@RequestBody String username, @RequestBody String token) {
        return "";
    }


}
