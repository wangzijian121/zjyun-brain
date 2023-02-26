package com.zjyun.brain.service;

import com.zjyun.brain.module.Message;
import com.zjyun.brain.module.User;

public interface IUser {

    /**
     * Get user by username.
     *
     * @param username username
     * @return
     */
    User  getUserByName(String  username);

}
