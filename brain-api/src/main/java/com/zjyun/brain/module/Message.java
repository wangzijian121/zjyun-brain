package com.zjyun.brain.module;

import java.awt.*;
import java.util.Date;

public class Message {

    private Integer id;
    private String user_id;
    private Integer brain_id;
    private Integer label_id;
    private String content;
    private Date createTime;

    public Message(Integer id, String user_id, Integer brain_id, Integer label_id, String content, Date createTime) {
        this.id = id;
        this.user_id = user_id;
        this.brain_id = brain_id;
        this.label_id = label_id;
        this.content = content;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getBrain_id() {
        return brain_id;
    }

    public void setBrain_id(Integer brain_id) {
        this.brain_id = brain_id;
    }

    public Integer getLabel_id() {
        return label_id;
    }

    public void setLabel_id(Integer label_id) {
        this.label_id = label_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
