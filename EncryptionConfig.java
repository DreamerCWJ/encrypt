package com.sskj.lib.encrypt;

/**
 * Created by lf on 2020/10/28 9:35.
 */
public class EncryptionConfig {
    private static AesEncryptAlgorithm aal = new AesEncryptAlgorithm();

    // 加密
    public static String encrypt(String result) {
        try {
            return aal.encrypt(result, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    // 解密
    public static String decrypt(String result) {
        try {
            return aal.decrypt(result, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
