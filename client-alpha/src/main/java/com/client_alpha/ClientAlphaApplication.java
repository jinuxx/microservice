package com.client_alpha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author XuJin
 * @since 2018/12/23 20:09
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientAlphaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientAlphaApplication.class, args);
    }
}
