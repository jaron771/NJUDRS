package com.nju.svcdisambiguation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SvcDisambiguationApplication {

    public static void main(String[] args) {

        SpringApplication.run(SvcDisambiguationApplication.class, args);

    }

}
