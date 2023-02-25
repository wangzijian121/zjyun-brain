package com.zjyun.brain.service;

import com.zjyun.brain.module.Message;

public interface IBrain {

    /**
     * Recall  message
     *
     * @param keywords keywords
     * @return
     */
    String recall(String keywords);

    /**
     * Memory message
     *
     * @param message
     * @return
     */
    void remember(Message message);

    /**
     * Brain info
     *
     * @return
     */
    String getBrainInfo();


}
