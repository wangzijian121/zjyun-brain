package com.zjyun.brain.module;

import java.util.Date;

public class Auth {

    private Integer id;
    private String  userId;
    private String  token;
    private Integer numberOfConnection;
    private Date expireTime;

    public Auth(Integer id, String userId, String token, Integer numberOfConnection, Date expire_time) {
        this.id = id;
        this.userId = userId;
        this.token = token;
        this.numberOfConnection = numberOfConnection;
        this.expireTime = expire_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getNumberOfConnection() {
        return numberOfConnection;
    }

    public void setNumberOfConnection(Integer numberOfConnection) {
        this.numberOfConnection = numberOfConnection;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
}
