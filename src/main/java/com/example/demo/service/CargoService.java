package com.example.demo.service;

import com.example.demo.controllers.dto.CargoCreateRequestDto;
import com.example.demo.controllers.dto.CargoResponseDto;
import com.example.demo.controllers.dto.CargoUpdateDto;
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

    // 추적하기
    public CargoResponseDto getCargo(String trackingId) {
        return cargo.getCargo(trackingId);
    }

    // 상태변경하기
    public CargoResponseDto updateCargo(
            String trackingId,
            CargoUpdateDto cargoUpdateDto
    ) {
        return cargo.updateCargo(trackingId, cargoUpdateDto);
    }



}
