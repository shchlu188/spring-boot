package com.scl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/2/15
 * Description:
 */
//@ResponseBody
//@Controller
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }
}
