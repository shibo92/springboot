package com.shibo.config;

import com.shibo.filter.MyFilter;
import com.shibo.listener.MyListener;
import com.shibo.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


/**
 * 注册三大组建(servlet、filter、listener)
 */
@Configuration
public class MyServerConfig {


    @Bean
    public ServletRegistrationBean myServlet() {
        return new ServletRegistrationBean(new MyServlet(), "/myServlet");
    }

    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean filterRegistrationBean =new  FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/myServlet","/hello"));
        filterRegistrationBean.setOrder(1);//order的数值越小 则优先级越高
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean myFilter2() {
        FilterRegistrationBean filterRegistrationBean =new  FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/myServlet","/hello"));
        filterRegistrationBean.setOrder(2);//order的数值越小 则优先级越高
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener(){
        return new ServletListenerRegistrationBean<MyListener>(new MyListener());
    }
}
