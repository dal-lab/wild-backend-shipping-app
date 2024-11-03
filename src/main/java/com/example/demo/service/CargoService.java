package com.example.demo.service;

import com.example.demo.controllers.dto.CargoCreateRequestDto;
import com.example.demo.controllers.dto.CargoResponseDto;
import com.example.demo.model.Cargo;
import org.springframework.stereotype.Service;

@Service
public class CargoService {

    private final Cargo cargo;

    public CargoService(Cargo cargo) {
        this.cargo = cargo;
    }

    // 예약하기
    public CargoResponseDto createCargo(
            CargoCreateRequestDto cargoCreateRequestDto) {
        return cargo.createCargo(cargoCreateRequestDto);
    }

}
