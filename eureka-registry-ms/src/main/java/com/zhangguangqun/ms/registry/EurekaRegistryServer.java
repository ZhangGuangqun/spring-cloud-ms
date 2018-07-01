package com.zhangguangqun.ms.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaRegistryServer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegistryServer.class, args);
    }
}
