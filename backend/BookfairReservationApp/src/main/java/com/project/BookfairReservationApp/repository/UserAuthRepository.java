package com.project.BookfairReservationApp.repository;

import com.project.BookfairReservationApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAuthRepository extends JpaRepository <User, Long>{
    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);
}
