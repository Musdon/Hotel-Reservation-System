package com.musdon.HotelReservationSystem.repository;

import com.musdon.HotelReservationSystem.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
