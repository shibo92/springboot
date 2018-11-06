package com.shibo.config;

import com.shibo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 标记为配置文件
@Configuration
public class AppConfig {

    // 将方法返回值配置到容器，组件id = 方法名
    // 调用时：使用helloService.xxx();
    // 改为 beans.xml 配置
    // @Bean
    // public HelloService helloService(){
    //     return new HelloService();
    // }
}
