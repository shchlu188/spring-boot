package com.scl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotBlank;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/2/17
 * Description:
 */
@RequestMapping("/user")
@Controller
public class LoginController {
    @PostMapping("/login")
    @Validated
//    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") @NotBlank String username,
                        @RequestParam("password") @NotBlank String password,
                        Map<String, Object> msg, HttpSession session) {
        if ("123456".equals(password)) {
            session.setAttribute("loginUser", username);
            return "redirect: /main.html";
        } else {
            msg.put("msg", "用户名或密码错误");
            return "login";
        }
    }
}
