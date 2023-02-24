package com.zjyun.brain.service;

import com.zjyun.brain.module.Message;

public interface IBrain {

    String  recall();

    String remember(Message message);

    String  getBrainInfo();


}
