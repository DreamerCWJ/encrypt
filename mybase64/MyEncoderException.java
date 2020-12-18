package com.sskj.lib.encrypt.mybase64;

/**
 * Created by lf on 2020/10/29 12:13.
 */
public class MyEncoderException extends Exception {
    private static final long serialVersionUID = 1L;

    public MyEncoderException() {
    }

    public MyEncoderException(String message) {
        super(message);
    }

    public MyEncoderException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyEncoderException(Throwable cause) {
        super(cause);
    }
}
