package com.zgm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = "com.sui.travel.repository")
public class Application {
    public static void main(String[] args)throws Exception{
        SpringApplication.run(Application.class,args);
    }
}
