package com.aether.util;

/**
 * 密码加密
 * @author liuyang
 *
 */
public class PasswordUtil {
    private static final int HASH_ITERATIONS = 1;

    public static String generatePassword(String username, String password) {
        return MD5Util.encrypt(password, username, HASH_ITERATIONS);
    }

}
