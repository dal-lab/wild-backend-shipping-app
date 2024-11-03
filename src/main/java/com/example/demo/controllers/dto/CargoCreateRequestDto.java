package com.example.demo.controllers.dto;

import com.example.demo.model.Description;
import com.example.demo.model.EndLocation;
import com.example.demo.model.Height;
import com.example.demo.model.Length;
import com.example.demo.model.Name;
import com.example.demo.model.StartLocation;
import com.example.demo.model.Weight;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record CargoCreateRequestDto(
        @NotNull(message = "Name is required")
        Name name,
        @NotNull(message = "Description is required")
        Description description,
        @Min(1)
        int quantity,
        @NotNull(message = "Weight is required")
        Weight weight,
        @NotNull(message = "Length is required")
        Length length,
        @NotNull(message = "Height is required")
        Height height,
        @NotNull(message = "StartLocation is required")
        StartLocation startLocation,
        @NotNull(message = "EndLocation is required")
        EndLocation endLocation
) {

}
