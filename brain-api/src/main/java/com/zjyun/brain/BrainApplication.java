package com.zjyun.brain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.zjyun.brain"})
@MapperScan("com.zjyun.brain.mapper")
@EnableSwagger2
public class BrainApplication {
    public static void main(String[] args) {
        SpringApplication.run(BrainApplication.class, args);
    }
}
