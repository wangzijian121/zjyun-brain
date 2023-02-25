package com.zjyun.brain.module;

/**
 * Use Class
 *
 * @author zjjian Wang
 * @date 2023年2月25日
 */
public class User {

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


    public User(String username, String platform, String registrationTime) {
        this.username = username;
        this.platform = platform;
        this.registrationTime = registrationTime;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
    }


}

