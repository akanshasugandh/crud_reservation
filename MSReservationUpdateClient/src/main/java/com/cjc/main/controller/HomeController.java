package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Reservation;
import com.cjc.main.servicei.ReservationServiceI;

@RestController
public class HomeController
{
	@Autowired
	ReservationServiceI rsi;
	
	@PutMapping("/updateData/{reservationId}")
	public ResponseEntity<String> updateData(@PathVariable int reservationId, @RequestBody Reservation r)
	{
		rsi.updateDetails(reservationId, r);
		String str="Reservation data updated successfully";
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}
	
	@PatchMapping("/updateName/{reservationId}")
	public ResponseEntity<String> updateNameData(@PathVariable int reservationId, @RequestBody Reservation r)
	{
		rsi.updateName(reservationId, r);
		String str="Reservation name updated successfully";
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}

}
