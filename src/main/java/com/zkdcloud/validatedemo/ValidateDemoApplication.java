package com.zkdcloud.validatedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableAspectJAutoProxy
@SpringBootApplication
public class ValidateDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ValidateDemoApplication.class, args);
    }
}
