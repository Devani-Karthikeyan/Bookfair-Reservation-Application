package com.project.BookfairReservationApp.repository;

import com.project.BookfairReservationApp.entity.Stall;
import com.project.BookfairReservationApp.enumtype.StallStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StallRepository extends JpaRepository<Stall, Long> {
    List<Stall> findByHallIdAndStatus(Long hallId, StallStatus status);
}
