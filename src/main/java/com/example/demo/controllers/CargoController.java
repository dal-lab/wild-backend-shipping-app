package com.example.demo.controllers;

import com.example.demo.controllers.dto.CargoCreateRequestDto;
import com.example.demo.controllers.dto.CargoResponseDto;
import com.example.demo.service.CargoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cargoes")
public class CargoController {

    private final CargoService cargoService;

    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @PostMapping
    public CargoResponseDto createCargo(
            @RequestBody
            @Valid CargoCreateRequestDto cargoCreateRequestDto
    ) {
        return cargoService.createCargo(cargoCreateRequestDto);
    }

    @GetMapping("/{trackingId}/tracks")
    public CargoResponseDto getCargo(
            @PathVariable String trackingId
    ) {
        return cargoService.getCargo(trackingId);
    }

}
