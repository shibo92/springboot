package com.shibo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 官方例子
 *
 * @author pzr
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}