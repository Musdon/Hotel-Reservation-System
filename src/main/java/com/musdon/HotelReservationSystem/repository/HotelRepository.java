package com.musdon.HotelReservationSystem.repository;

import com.musdon.HotelReservationSystem.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
