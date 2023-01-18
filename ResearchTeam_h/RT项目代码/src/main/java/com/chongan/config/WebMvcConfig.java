package com.chongan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //String path = System.getProperty("user.dir") + "/src/main/resources/static/img/";
        registry.addResourceHandler("/img/**")
                .addResourceLocations("file:" + "/home/researshTeam/img/")
                .setCacheControl(CacheControl.noCache());
        //.addResourceLocations("file:" + "D:/Desktop/ResearchTeam/static/img/")
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration =  registry.addInterceptor(new loginInterceptor());
        registration.addPathPatterns("/back*");
        registration.excludePathPatterns("/backLogin",
                "/**/*.html",
                "/**/*.js",
                "/**/*.css",
                "/**/*.jpg");
    }
}
