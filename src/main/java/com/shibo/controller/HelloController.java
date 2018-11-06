package com.shibo.controller;

import com.shibo.exception.UserNotExistsException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HelloController {
   /* @RequestMapping(value = "/index")
    public String index() {
        return "login";
    }*/

   @Value("${server.port}")
   private String val;
    @RequestMapping(value = "/success")
    public String success(Map<String, Object> map) {
        map.put("val",val);
        map.put("hello","你好");
        return "success";
    }

    @RequestMapping(value = "/user")
    public String user(@RequestParam("username")String userName) {
        if("bbb".equals(userName)){
            throw new UserNotExistsException();
        }
        return "success";
    }
}
