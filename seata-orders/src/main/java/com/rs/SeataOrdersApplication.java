package com.rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SeataOrdersApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrdersApplication.class, args);
    }

}
