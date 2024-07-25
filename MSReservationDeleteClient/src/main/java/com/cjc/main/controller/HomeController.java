package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.servicei.ReservationServiceI;

@RestController
public class HomeController
{
	@Autowired
	ReservationServiceI rsi;
	
	@DeleteMapping("/deleteData/{reservationId}")
	public ResponseEntity<String> deleteData(@PathVariable int reservationId)
	{
		rsi.deleteDetails(reservationId);
		String str="Reservation data deleted successfully!";
		return new ResponseEntity<String>(str, HttpStatus.OK);
		
	}

}
