package com.sskj.lib.encrypt.mybase64;

/**
 * Created by lf on 2020/10/29 12:10.
 */
public interface MyBinaryEncoder extends MyEncoder {
    byte[] encode(byte[] var1) throws MyEncoderException;
}
