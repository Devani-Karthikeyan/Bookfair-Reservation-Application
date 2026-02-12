package com.project.BookfairReservationApp.service;

import com.project.BookfairReservationApp.entity.Hall;

import java.util.List;

public interface HallService {

    public Hall createHall(Hall hall);

    public List<Hall> getAllHalls();

    public Hall getHallById(Long id);

    public Hall updateHall(Hall hall);

    public void deleteHall(Long id);

}
