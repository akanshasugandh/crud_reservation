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
	public void updateDetails(int reservationId, Reservation r) 
	{
		rr.updateByReservationId(r.getReservationName(), r.getContact(), r.getEmail(), r.getAge(), r.getGender(), r.getReservationDate(), r.getReservationTime(), reservationId);
		
	}

	@Override
	public void updateName(int reservationId, Reservation r) {
		rr.updateReservationName(r.getReservationName(), reservationId);
	}

}
