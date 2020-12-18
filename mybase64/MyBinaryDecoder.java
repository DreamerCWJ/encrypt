package com.sskj.lib.encrypt.mybase64;

/**
 * Created by lf on 2020/10/29 12:10.
 */
public interface MyBinaryDecoder extends MyDecoder {
    byte[] decode(byte[] var1) throws MyDecoderException;
}
