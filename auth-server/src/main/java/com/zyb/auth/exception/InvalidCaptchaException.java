package com.zyb.auth.exception;

/**
 * @ClassName InvalidCaptchaException
 * @Author zhaoyb
 * @Date 2024-10-23
 * @Version 1.0
 */
public class InvalidCaptchaException extends RuntimeException{

    public InvalidCaptchaException(String message) {
        super(message);
    }
}
