package com.musdon.HotelReservationSystem.repository;

import com.musdon.HotelReservationSystem.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
