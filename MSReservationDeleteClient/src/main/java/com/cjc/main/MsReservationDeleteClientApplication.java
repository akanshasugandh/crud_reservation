package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsReservationDeleteClientApplication {

	public static void main(String[] args) {
		System.out.println("Reservation-Delete client");
		SpringApplication.run(MsReservationDeleteClientApplication.class, args);
	}

}
