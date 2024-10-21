package com.example.demo.controllers.domain;

import java.time.LocalDateTime;

public class Cargo {

    private CargoId id;

    private Receiver receiver;

    private LocalDateTime bookingTime;

    private TrackingStatus status;

    private Location location;
}
