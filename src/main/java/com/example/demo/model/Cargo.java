package com.example.demo.model;

import com.example.demo.controllers.dto.CargoCreateRequestDto;
import com.example.demo.controllers.dto.CargoResponseDto;
import com.example.demo.controllers.dto.CargoUpdateDto;
import com.example.demo.exception.InvalidTrackingIdException;
import com.example.demo.infrastructure.CargoRepository;
import org.springframework.stereotype.Component;

// Root Entity (Cargo Aggregate)
@Component
public class Cargo {

    private final CargoRepository cargoRepository;

    public Cargo(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    // 화물 예약하기
    public CargoResponseDto createCargo(
            CargoCreateRequestDto cargoCreateRequestDto
    ) {
        CargoItemId id = new CargoItemId();
        CargoItem cargoItem = createCargoItem(
                cargoCreateRequestDto, id);

        cargoRepository.save(cargoItem);
        return getCargoResponseDto(cargoItem);
    }

    // 화물의 배송 현황 추적
    public CargoResponseDto getCargo(String trackingId) {
        CargoItem cargoItem = getCargoItem(trackingId);
        return getCargoResponseDto(cargoItem);
    }

    // 화물 배송 상태 변경
    public CargoResponseDto updateCargo(
            String trackingId,
            CargoUpdateDto cargoUpdateDto
    ) {
        CargoItem updateCargo = updateCargoItem(trackingId,
                cargoUpdateDto);
        cargoRepository.save(updateCargo);

        return getCargoResponseDto(updateCargo);
    }

    private CargoResponseDto getCargoResponseDto(CargoItem cargoItem) {
        return new CargoResponseDto(
                cargoItem.getId(),
                cargoItem.getName(),
                cargoItem.getDescription(),
                cargoItem.getQuantity(),
                cargoItem.getWeight(),
                cargoItem.getLength(),
                cargoItem.getHeight(),
                cargoItem.getStartLocation(),
                cargoItem.getEndLocation(),
                cargoItem.getCurrentLocation(),
                cargoItem.getStatus()
        );
    }

    private CargoItem getCargoItem(String trackingId) {
        return cargoRepository.findById(trackingId).orElseThrow(
                InvalidTrackingIdException::new
        );
    }

    private CargoItem createCargoItem(
            CargoCreateRequestDto cargoCreateRequestDto, CargoItemId id) {
        return new CargoItem(
                id,
                cargoCreateRequestDto.name(),
                cargoCreateRequestDto.description(),
                cargoCreateRequestDto.quantity(),
                cargoCreateRequestDto.weight(),
                cargoCreateRequestDto.length(),
                cargoCreateRequestDto.height(),
                cargoCreateRequestDto.startLocation(),
                cargoCreateRequestDto.endLocation(),
                null,
                new Status("배송 대기중", CurrentStatus.PENDING)
        );
    }

    private CargoItem updateCargoItem(String trackingId,
            CargoUpdateDto cargoUpdateDto) {
        CargoItem cargoItem = getCargoItem(trackingId);
        return new CargoItem(
                cargoItem.getId(),
                cargoItem.getName(),
                cargoItem.getDescription(),
                cargoItem.getQuantity(),
                cargoItem.getWeight(),
                cargoItem.getLength(),
                cargoItem.getHeight(),
                cargoItem.getStartLocation(),
                cargoItem.getEndLocation(),
                cargoUpdateDto.currentLocation(),
                cargoUpdateDto.status()
        );
    }

}
