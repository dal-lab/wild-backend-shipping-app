package com.example.demo.controllers.dto;

import com.example.demo.model.CurrentLocation;
import com.example.demo.model.Status;
import jakarta.validation.constraints.NotNull;

public record CargoUpdateDto(
        @NotNull(message = "CurrentLocation is required")
        CurrentLocation currentLocation,
        @NotNull(message = "Status is required")
        Status status
) {

}
