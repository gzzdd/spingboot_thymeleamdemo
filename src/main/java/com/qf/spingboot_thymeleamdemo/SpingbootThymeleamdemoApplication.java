package com.qf.spingboot_thymeleamdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
public class SpingbootThymeleamdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpingbootThymeleamdemoApplication.class, args);
    }

}
