package com.example.homeworkmanagesystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override

    public void addCorsMappings(CorsRegistry registry) {

// 这里匹配了所有的URL，允许所有的外域发起跨域请求，允许外域发起请求任意HTTP Method，允许跨域请求包含任意的头信息。

        registry.addMapping("/**")

                .allowedHeaders("*")

                .allowedMethods("*")

                .allowedOrigins("*")

                .allowCredentials(true);

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        //默认地址（可以是页面或后台请求接口）
        registry.addViewController("/").setViewName("login");
        //设置过滤优先级最高
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

}
