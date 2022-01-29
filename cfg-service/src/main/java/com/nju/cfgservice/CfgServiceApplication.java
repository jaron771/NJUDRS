package com.nju.cfgservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CfgServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CfgServiceApplication.class, args);
    }

}
