package com.example.demo.domain.services;

import com.example.demo.domain.model.Cargo;
import com.example.demo.domain.model.CargoStatus;
import com.example.demo.infrastructure.CargoRepository;
import org.springframework.stereotype.Service;

@Service
public class CargoService {

    private final CargoRepository cargoRepository;

    public CargoService() {
        this.cargoRepository = new CargoRepository();
    }

    public void bookNewCargo(
            String name,
            String description,
            float weight,
            int volume,
            String originLocation,
            String destinationLocation


    ) {
        String id = "CARGO_" + cargoRepository.findAll().length;
        // Some logic here
        Cargo newCargo = new Cargo(
                id,
                name,
                description,
                weight,
                volume,
                originLocation,
                destinationLocation
        );
        cargoRepository.save(newCargo);
    }

    public Cargo[] showCargoAll() {
        // Some logic here
        return cargoRepository.findAll();
    }

    public void shiftCargo(String cargoId, String newLocation, CargoStatus status) {
        Cargo cargo = cargoRepository.find(cargoId);
        cargo.setCurrentLocation(newLocation);
        cargo.setStatus(status);
        cargoRepository.save(cargo);
    }
}
