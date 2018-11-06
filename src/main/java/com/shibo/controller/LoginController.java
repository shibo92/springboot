package com.shibo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String userName,
                        @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession session) {
        if (userName.equals("111") && password.equals("111")) {
            session.setAttribute("loginUser",userName);
            return "redirect:/main.html";
        } else {
            map.put("errormsg", "用户名密码错误");
            return "login";
        }
    }
}
