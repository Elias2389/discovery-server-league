package com.ae.discovery.server.league;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerLeagueApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerLeagueApplication.class, args);
	}

}
