package org.learntek.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MathApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MathApiGatewayApplication.class, args);
	}

}
