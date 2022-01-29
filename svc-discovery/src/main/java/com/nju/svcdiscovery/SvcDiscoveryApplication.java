package com.nju.svcdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SvcDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SvcDiscoveryApplication.class, args);
    }

}
