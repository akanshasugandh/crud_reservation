package com.cjc.main.controller;

import java.sql.Time;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Reservation;
import com.cjc.main.servicei.ReservationServiceI;

@RestController
public class HomeController
{
	@Autowired
	ReservationServiceI rsi;
	
	@PostMapping("/saveData")
	public ResponseEntity<String> saveData(@RequestBody Reservation r)
	{
		r.setReservationDate(new Date());
		r.setReservationTime(new Time(System.currentTimeMillis()));
		rsi.saveDetails(r);
		String str="Reservation details saved successfully!";
		return new ResponseEntity<String>(str, HttpStatus.CREATED);
		
	}

}
