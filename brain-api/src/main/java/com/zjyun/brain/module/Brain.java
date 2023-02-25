package com.zjyun.brain.module;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;

/**
 * Brain Class
 *
 * @author zjjian Wang
 * @date 2023年2月25日
 */
public class Brain {

    private Integer id;
    private Integer useId;

    List<Label> labelList;

    private Integer recallCount;

    private Integer rememberTotal;

    public Brain(Integer id, Integer useId, List<Label> labelList, Integer recallCount, Integer rememberTotal) {
        this.id = id;
        this.useId = useId;
        this.labelList = labelList;
        this.recallCount = recallCount;
        this.rememberTotal = rememberTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUseId() {
        return useId;
    }

    public void setUseId(Integer useId) {
        this.useId = useId;
    }

    public List<Label> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<Label> labelList) {
        this.labelList = labelList;
    }

    public Integer getRecallCount() {
        return recallCount;
    }

    public void setRecallCount(Integer recallCount) {
        this.recallCount = recallCount;
    }

    public Integer getRememberTotal() {
        return rememberTotal;
    }

    public void setRememberTotal(Integer rememberTotal) {
        this.rememberTotal = rememberTotal;
    }
}
