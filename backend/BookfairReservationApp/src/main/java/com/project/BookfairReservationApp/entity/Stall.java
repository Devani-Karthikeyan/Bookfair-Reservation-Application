package com.project.BookfairReservationApp.entity;

import com.project.BookfairReservationApp.enumtype.StallSize;
import com.project.BookfairReservationApp.enumtype.StallStatus;
import jakarta.persistence.Id;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "stalls")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stall_name", nullable = false)
    private String stallName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StallSize size;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StallStatus status;

    @Column(nullable = false)
    private Double price;

    @Column(length = 500)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hall_id", nullable = false)
    private Hall hall;

}

