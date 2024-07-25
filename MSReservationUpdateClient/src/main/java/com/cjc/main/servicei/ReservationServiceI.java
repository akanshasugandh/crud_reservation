package com.cjc.main.servicei;

import com.cjc.main.model.Reservation;

public interface ReservationServiceI 
{

	public void updateDetails(int reservationId, Reservation r);

	public void updateName(int reservationId, Reservation r);

}
