package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.repository.ReservationRepository;
import com.cjc.main.servicei.ReservationServiceI;

import jakarta.transaction.Transactional;

@Service
public class ReservationServiceImpl implements ReservationServiceI
{
	@Autowired
	ReservationRepository rr;

	@Transactional
	@Override
	public void deleteDetails(int reservationId)
	{
		rr.deleteByReservationId(reservationId);
	}
}
