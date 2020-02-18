package com.scl.exception;

/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/2/18
 * Description:
 */
public class UserNotExistException extends RuntimeException {
    public UserNotExistException(){
        super("用户不存在");
    }
}
