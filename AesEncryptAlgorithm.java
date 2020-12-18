package com.sskj.lib.encrypt;

/**
 * Aes加密算法实现
 *
 * @author yinjihuan
 */
public class AesEncryptAlgorithm implements EncryptAlgorithm {

    // public static String secretKey = "d86d7bab3d6ac01ad9dc6a897652f2d2";
    public static String secretKey = "ff2a838d785a4358";

    @Override
    public String encrypt(String content, String encryptKey) throws Exception {
        return AesEncryptUtils2.aesEncrypt(content, secretKey);
    }

    @Override
    public String decrypt(String encryptStr, String decryptKey) throws Exception {
        return AesEncryptUtils2.aesDecrypt(encryptStr, secretKey);
    }

}
