package com.example.demo.dto;

import com.example.demo.domain.model.CargoStatus;

public record CargoDto(
        String id,
        String name,
        String description,
        float weight, // in kilograms
        int volume, // in cubic meters
        String startingLocation,
        String currentLocation,
        String specifiedLocation,
        CargoStatus status
) {

}
