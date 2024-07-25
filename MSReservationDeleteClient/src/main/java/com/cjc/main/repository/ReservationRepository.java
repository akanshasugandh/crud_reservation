package com.cjc.main.repository;

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
	@Query(name = "deleteByReservationId", value = "delete from Reservation where reservationId=?1")
	public void deleteByReservationId(int reservationId);

}
