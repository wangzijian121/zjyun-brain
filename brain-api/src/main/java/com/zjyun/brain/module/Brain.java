package com.zjyun.brain.module;

import java.util.Date;

public class Brain {

    private String name;
    private String RecallCount;
    private Date createTime;
    private Date useEnvironment;


    public Brain(String name, String recallCount, Date createTime) {
        this.name = name;
        RecallCount = recallCount;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecallCount() {
        return RecallCount;
    }

    public void setRecallCount(String recallCount) {
        RecallCount = recallCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
