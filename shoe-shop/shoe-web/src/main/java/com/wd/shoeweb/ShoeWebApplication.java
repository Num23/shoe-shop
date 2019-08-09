package com.wd.shoeweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.wd")
public class ShoeWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoeWebApplication.class, args);
    }

}
