package com.test.gao.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.gao.cms.mapper")
public class StemQuestionInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StemQuestionInfoApplication.class, args);
    }
}
