package com.shibo.exception;

public class UserNotExistsException extends RuntimeException {
    public UserNotExistsException(){
        super("我是被抛出的异常信息");
    }
}
