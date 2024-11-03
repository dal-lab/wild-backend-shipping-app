package com.example.demo.controllers.dto;

import com.example.demo.model.Description;
import com.example.demo.model.EndLocation;
import com.example.demo.model.Height;
import com.example.demo.model.Length;
import com.example.demo.model.Name;
import com.example.demo.model.StartLocation;
import com.example.demo.model.Weight;
import jakarta.validation.constraints.NotBlank;

public record CargoCreateRequestDto(
        @NotBlank
        Name name,
        @NotBlank
        Description description,
        @NotBlank
        int quantity,
        @NotBlank
        Weight weight,
        @NotBlank
        Length length,
        @NotBlank
        Height height,
        @NotBlank
        StartLocation startLocation,
        @NotBlank
        EndLocation endLocation
) {

}
