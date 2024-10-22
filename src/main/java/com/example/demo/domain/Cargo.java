package com.example.demo.domain;

import java.time.LocalDateTime;

public class Cargo {

    private CargoId id;

    private Receiver receiver;

    private LocalDateTime bookingTime;

    private TrackingStatus status;

    private Location location;

    public Cargo(
            CargoId id,
            Receiver receiver,
            LocalDateTime bookingTime,
            TrackingStatus status,
            Location location) {
        this.id = id;
        this.receiver = receiver;
        this.bookingTime = bookingTime;
        this.status = status;
        this.location = location;
    }
}
