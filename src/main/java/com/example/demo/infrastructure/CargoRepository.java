package com.example.demo.infrastructure;

import com.example.demo.model.CargoItem;
import java.util.Optional;

public interface CargoRepository {

    void save(CargoItem cargoItem);

    Optional<CargoItem> findById(String id);

}
