package com.example.homeworkmanagesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.homeworkmanagesystem.dao")
public class HomeworkmanagesystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkmanagesystemApplication.class, args);
    }

}
