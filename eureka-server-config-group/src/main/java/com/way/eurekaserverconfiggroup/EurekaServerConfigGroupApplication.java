package com.way.eurekaserverconfiggroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaServerConfigGroupApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerConfigGroupApplication.class, args);
    }
}
