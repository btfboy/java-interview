package com.interview.mybatislearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.interview.mybatislearning.mapper")
public class MyBatisLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisLearningApplication.class, args);
    }

}
