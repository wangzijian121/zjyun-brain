package com.zjyun.brain.module;

import java.util.List;
/**
 * Label Class
 *
 * @author zjjian Wang
 * @date 2023年2月25日
 */
public class Label {
    private Integer id;

    private Integer brain_id;
    private String name;

    public Label(Integer id, Integer brain_id, String name) {
        this.id = id;
        this.brain_id = brain_id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBrain_id() {
        return brain_id;
    }

    public void setBrain_id(Integer brain_id) {
        this.brain_id = brain_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
