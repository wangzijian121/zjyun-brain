package com.zjyun.brain.module;

import java.util.Date;

public class Message {

    private String label;
    private String content;

    private String createUser;

    private Date createTime;

    public Message(String label, String content, String createUser, Date createTime) {
        this.label = label;
        this.content = content;
        this.createUser = createUser;
        this.createTime = createTime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
