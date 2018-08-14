package com.xudd.asj.validate.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xudd.asj.validate.service.mapper")
public class ValidateServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidateServiceApplication.class, args);
    }
}
