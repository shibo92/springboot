package com.shibo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;


// 可以通过importSource引入配置文件，但是springboot推荐使用@Bean注解去配置Service等
// @ImportResource(locations = {"classpath:beans.xml"})
@MapperScan("com.shibo.mapper")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
          SpringApplication.run(Application.class, args);
    }

    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    public static class MyViewResolver implements ViewResolver {
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}