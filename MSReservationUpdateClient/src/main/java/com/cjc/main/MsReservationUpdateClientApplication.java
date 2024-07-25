package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsReservationUpdateClientApplication {

	public static void main(String[] args) {
		System.out.println("Reservation-Update client");
		SpringApplication.run(MsReservationUpdateClientApplication.class, args);
	}

}
