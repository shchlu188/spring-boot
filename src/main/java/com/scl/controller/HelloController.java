package com.scl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/2/15
 * Description:
 */
//@ResponseBody
//@Controller
@Controller
public class HelloController {
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }

    @GetMapping("/thy")
    public String success(Map<String,String> map){
        map.put("hello", "Tom");
        return "success";
    }
    @GetMapping("/")
    public String index(){
        return "login";
    }
}
