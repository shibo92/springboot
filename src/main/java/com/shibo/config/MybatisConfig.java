package com.shibo.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {

    // 改为在gpplication.yml中配置，更方便
    // @Bean
    // public ConfigurationCustomizer configurationCustomizer(){
    //     return new ConfigurationCustomizer() {
    //         @Override
    //         public void customize(org.apache.ibatis.session.Configuration configuration) {
    //             configuration.setMapUnderscoreToCamelCase(true);
    //         }
    //     };
    // }
}
