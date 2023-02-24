package com.zjyun.brain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.zjyun.brain"})
@MapperScan("com.com.zjyun.brain.mapper")
public class BrainApplication {
    public static void main(String[] args) {
        SpringApplication.run(BrainApplication.class, args);
    }
}
