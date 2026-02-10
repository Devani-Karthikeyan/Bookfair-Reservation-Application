package com.project.BookfairReservationApp.repository;

import com.project.BookfairReservationApp.entity.Hall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HallRepository extends JpaRepository<Hall, Long> {
    // Add hall-specific queries here if needed
}
