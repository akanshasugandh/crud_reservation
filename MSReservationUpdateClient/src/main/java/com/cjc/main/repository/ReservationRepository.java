package com.cjc.main.repository;

import java.sql.Time;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Reservation;

import jakarta.transaction.Transactional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer>
{

	@Transactional
	@Modifying
	@Query(name = "updateByReservationId", value = "update Reservation set reservationName=?1, contact=?2, "
			+ "email=?3, age=?4, gender=?5, reservationDate=?6, reservationTime=?7 where reservationId=?8")
	public void updateByReservationId(String reservationName, long contact, String email, int age, String gender,
			Date reservationDate, Time reservationTime, int reservationId);

	@Transactional
	@Modifying
	@Query(name = "updateByReservationName", value = "update Reservation set reservationName=?1 where reservationId=?2")
	public void updateReservationName(String reservationName, int reservationId);

}
