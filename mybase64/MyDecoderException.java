package com.sskj.lib.encrypt.mybase64;

/**
 * Created by lf on 2020/10/29 12:11.
 */
public class MyDecoderException extends Exception {
    private static final long serialVersionUID = 1L;

    public MyDecoderException() {
    }

    public MyDecoderException(String message) {
        super(message);
    }

    public MyDecoderException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDecoderException(Throwable cause) {
        super(cause);
    }
}
