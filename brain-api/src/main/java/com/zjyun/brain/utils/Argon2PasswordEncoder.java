package com.zjyun.brain.utils;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Argon2PasswordEncoder {

    /*
     * DEFAULT PARAMS
     */
    private static final int ITERATIONS = 2;
    private static final int MEMORY = 65536;
    private static final int PARALLELISM = 1;

    /*
     * Recommended argon2id Type Three types are available (ARGON2i,ARGON2d,ARGON2id).
     */
    public static final Argon2Factory.Argon2Types TYPE = Argon2Factory.Argon2Types.ARGON2id;

    /*
     * The factory pattern gets the singleton 2 object
     */
    private static final Argon2 INSTANCE = Argon2Factory.create(TYPE);

    /**
     * Use argon2id to encrypt passwords
     */

    public static String encode(String password) {
        return INSTANCE.hash(ITERATIONS, MEMORY, PARALLELISM, password.toCharArray());
    }

    /**
     * The argon2id algorithm is used to verify the correct password
     *
     * @param encodedPassword Encrypted password
     */
    public static boolean matches(String encodedPassword, String password) {
        return INSTANCE.verify(encodedPassword, password.toCharArray());
    }
}
