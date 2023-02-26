package com.zjyun.brain.service;

import com.zjyun.brain.module.Auth;
import com.zjyun.brain.module.User;

public interface IAuth {

    /**
     * Get auth token  by user.
     *
     * @param user user
     * @return
     */
    Auth getTokenByUser(User user);

    /**
     * Use argon2Id match password.
     *
     * @param auth auth
     * @return
     */
    Boolean matchPasswordByArgon2Id(Auth auth, String inputToken);
}
