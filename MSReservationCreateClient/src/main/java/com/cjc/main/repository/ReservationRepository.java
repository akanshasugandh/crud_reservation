package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer>
{

}
