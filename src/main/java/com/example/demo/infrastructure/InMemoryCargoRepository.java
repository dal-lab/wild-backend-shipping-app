package com.example.demo.infrastructure;

import com.example.demo.model.CargoItem;
import java.util.HashMap;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryCargoRepository implements CargoRepository {

    private final HashMap<String, CargoItem> cargo = new HashMap<>();

    @Override
    public void save(CargoItem cargoItem) {
        cargo.put(cargoItem.getId().id(), cargoItem);
    }

    @Override
    public Optional<CargoItem> findById(String id) {
        return Optional.ofNullable(cargo.get(id));
    }

}
