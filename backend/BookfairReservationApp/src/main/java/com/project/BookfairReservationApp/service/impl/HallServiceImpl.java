package com.project.BookfairReservationApp.service.impl;

import com.project.BookfairReservationApp.entity.Hall;
import com.project.BookfairReservationApp.repository.HallRepository;
import com.project.BookfairReservationApp.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HallServiceImpl implements HallService {

    @Autowired
    private HallRepository hallRepository;

    public Hall createHall(Hall hall) {
        return hallRepository.save(hall);
    }

    public List<Hall> getAllHalls() {
        return hallRepository.findAll();
    }

    public Hall getHallById(Long id) {
        return hallRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hall not found"));
    }

    public Hall updateHall(Hall hall) {
        return hallRepository.save(hall);
    }

    public void deleteHall(Long id) {
        hallRepository.deleteById(id);
    }
}
