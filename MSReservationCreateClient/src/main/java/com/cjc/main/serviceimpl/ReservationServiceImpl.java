package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Reservation;
import com.cjc.main.repository.ReservationRepository;
import com.cjc.main.servicei.ReservationServiceI;

@Service
public class ReservationServiceImpl implements ReservationServiceI
{
	@Autowired
	ReservationRepository rr;

	@Override
	public Reservation saveDetails(Reservation r) 
	{
		Reservation res=rr.save(r);
		return res;
	}

}
