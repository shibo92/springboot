package com.shibo.controller;

import com.shibo.exception.UserNotExistsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    /*@ResponseBody
    @ExceptionHandler(UserNotExistsException.class)
    public Map<String,Object> handleException(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code","01");
        map.put("message",e.getMessage());
        return map;
    }*/

    @ExceptionHandler(UserNotExistsException.class)
    public String handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","01");
        map.put("message","我在ExceptionHandler里，用来自适应页面和json");
        request.setAttribute("ext",map);
        // 转发到error，可以自适应json数据或是页面
        return "forward:/error";
    }
}
