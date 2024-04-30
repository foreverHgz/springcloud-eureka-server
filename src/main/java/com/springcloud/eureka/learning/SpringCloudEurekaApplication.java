package com.springcloud.eureka.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author forever_hgz
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaApplication {

    public static void main(String[] args) {
        // http://localhost:8082/
        // http://127.0.0.1:8082/
        // http://192.168.31.163:8082/
        // http://192.168.95.1:8082/
        // http://192.168.253.1:8082/
        SpringApplication.run(SpringCloudEurekaApplication.class, args);
    }

}
