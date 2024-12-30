package com.example.demo.controllers;

import com.example.demo.domain.model.Cargo;
import com.example.demo.domain.services.CargoService;
import com.example.demo.dto.CargoDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/cargo")
public class CargoController {
    public CargoService cargoService;

    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    //book new cargo
    @PostMapping
    public String bookNewCargo(@RequestBody CargoDto cargoDto) {
        cargoService.bookNewCargo(
                cargoDto.name(),
                cargoDto.description(),
                cargoDto.weight(),
                cargoDto.volume(),
                cargoDto.currentLocation(),
                cargoDto.specifiedLocation()
        );
        return "Cargo booked";
    }

    @RequestMapping("/showall")
    public List<CargoDto> showAllCargo() {
        Cargo[] cargos = cargoService.showCargoAll();
        return Arrays.stream(cargos).map(this::mapToDto).toList();

    }

    private CargoDto mapToDto(Cargo cargo) {
        return new CargoDto(
                cargo.getId(),
                cargo.getName(),
                cargo.getDescription(),
                cargo.getWeight(),
                cargo.getVolume(),
                cargo.getStartingLocation(),
                cargo.getDestinationLocation(),
                cargo.getCurrentLocation(),
                cargo.getStatus()
        );
    }


}
