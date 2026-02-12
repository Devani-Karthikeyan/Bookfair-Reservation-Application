package com.project.BookfairReservationApp.service;

import com.project.BookfairReservationApp.entity.Stall;
import com.project.BookfairReservationApp.entity.User;
import com.project.BookfairReservationApp.enumtype.StallStatus;

import java.util.List;

public interface StallService {
    /**
     * Reserve a stall - only PUBLISHER or VENDOR can reserve
     */
    public Stall reserveStall(Long stallId, User user);
    /**
     * Book a stall - only the user who reserved it can book
     */
    public Stall bookStall(Long stallId, User user);

    /**
     * Cancel reservation - only the user who reserved it can cancel
     */
    public Stall cancelReservation(Long stallId, User user);

    /**
     * List available stalls in a hall
     */
    public List<Stall> getAvailableStallsByHall(Long hallId);
}
