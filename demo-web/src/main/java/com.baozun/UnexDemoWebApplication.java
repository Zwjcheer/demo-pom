package com.baozun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootConfiguration
@EnableAutoConfiguration
public class UnexDemoWebApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(UnexDemoWebApplication.class,args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(UnexDemoWebApplication.class);
    }
}
