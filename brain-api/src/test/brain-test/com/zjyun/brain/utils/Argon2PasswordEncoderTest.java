package com.zjyun.brain.utils;

import org.junit.Assert;
import org.junit.Test;

public class Argon2PasswordEncoderTest {

    @Test
    public void encode() {
        String password = "12345678";
        String encryptionPassword = Argon2PasswordEncoder.encode(password);
        Assert.assertEquals(true, encryptionPassword.contains("argon2id"));
    }

    @Test
    public void matches_successful() {
        String password = "12345678";
        String encryptionPassword = Argon2PasswordEncoder.encode(password);
        Assert.assertEquals(true, Argon2PasswordEncoder.matches(encryptionPassword, "12345678"));
    }

    public void matches_failed() {
        String password = "12345678";
        String encryptionPassword = Argon2PasswordEncoder.encode(password);
        Assert.assertEquals(false, Argon2PasswordEncoder.matches(encryptionPassword, "87654321"));
    }
}