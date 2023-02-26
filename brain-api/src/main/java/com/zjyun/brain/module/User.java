package com.zjyun.brain.module;

import lombok.Data;

import java.io.Serializable;

/**
 * Use Class
 *
 * @author zjjian Wang
 * @date 2023年2月25日
 */
@Data
public class User implements Serializable {


    /**
     * id
     */
    private Integer id;
    /**
     * username
     */
    private String username;
    /**
     * Registration platform
     */
    private String platform;

    /**
     * registration time
     */
    private String registrationTime;


}

