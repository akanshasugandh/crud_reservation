package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsReservationReadClientApplication {

	public static void main(String[] args)
	{
		System.out.println("Reservation-Read client");
		SpringApplication.run(MsReservationReadClientApplication.class, args);
	}

}
