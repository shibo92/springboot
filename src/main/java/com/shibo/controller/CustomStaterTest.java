package com.shibo.controller;

import com.shibo.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomStaterTest {

    @Autowired
    HelloService helloService;

    @GetMapping("/sayHelloTest")
    public String sayHelloTest(){
        return helloService.sayHello("我是瓦力");
    }
}
