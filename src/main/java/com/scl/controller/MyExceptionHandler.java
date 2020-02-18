package com.scl.controller;

import com.scl.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/2/18
 * Description:
 */
@ControllerAdvice
public class MyExceptionHandler {
//    @ExceptionHandler(UserNotExistException.class)
//    @ResponseBody
//    public Map<String, Object> handlerException(Exception e){
//        Map<String,Object> map = new HashMap<>();
//        map.put("code", "user not exist");
//        map.put("message", e.getMessage());
//        return map;
//    }

    @ExceptionHandler(UserNotExistException.class)
    public String handlerException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("code", "user not exist");
        map.put("message", e.getMessage());
        request.setAttribute("ext", map);
        return "forward:/error";
    }

}
