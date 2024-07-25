package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Reservation;
import com.cjc.main.servicei.ReservationServiceI;

@RestController
public class HomeController
{
	@Autowired
	ReservationServiceI rsi;
	
	@GetMapping("/getData")
	public ResponseEntity<List<Reservation>> getData()
	{
		List<Reservation> resList=rsi.getDetails();
		return new ResponseEntity<List<Reservation>>(resList, HttpStatus.OK) ;
	}

}
