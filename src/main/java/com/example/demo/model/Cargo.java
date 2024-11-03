package com.example.demo.model;

import com.example.demo.controllers.dto.CargoCreateRequestDto;
import com.example.demo.controllers.dto.CargoResponseDto;
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
}
