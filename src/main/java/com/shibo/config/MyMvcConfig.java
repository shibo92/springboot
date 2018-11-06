package com.shibo.config;

import com.shibo.component.LoginHandlerInterceptor;
import com.shibo.component.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hahaha").setViewName("success");
    }

    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            /**
             * 配置interceptor
             */
            /*@Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerInterceptor())
                        .addPathPatterns("/**")
                        .excludePathPatterns("/index.html", "/", "/user/login");
            }*/
        };

        return adapter;
    }


    /**
     * 配置interceptor
     */
    /*@Override
    public void addInterceptors(InterceptorRegistry registry) {

        //添加拦截器
        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/**");
        super.addInterceptors(registry);
    }*/

    /**
     * 自定义视图解析器
     */
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocalResolver();
    }
}
