package com.example.demo.controllers.dto;

import com.example.demo.model.CargoItemId;
import com.example.demo.model.CurrentLocation;
import com.example.demo.model.Description;
import com.example.demo.model.EndLocation;
import com.example.demo.model.Height;
import com.example.demo.model.Length;
import com.example.demo.model.Name;
import com.example.demo.model.StartLocation;
import com.example.demo.model.Status;
import com.example.demo.model.Weight;

public record CargoResponseDto(
        CargoItemId id,
        Name name,
        Description description,
        int quantity,
        Weight weight,
        Length length,
        Height height,
        StartLocation startLocation,
        EndLocation endLocation,
        CurrentLocation currentLocation,
        Status status
) {

}
