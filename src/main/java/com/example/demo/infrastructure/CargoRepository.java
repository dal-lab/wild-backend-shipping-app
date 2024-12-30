package com.example.demo.infrastructure;

import com.example.demo.domain.model.Cargo;

import java.util.HashMap;

public class CargoRepository {
    HashMap<String, Cargo> cargoHashMap = new HashMap<>();

    public void save(Cargo cargo) {
        cargoHashMap.put(cargo.getId(), cargo);
    }

    public Cargo find(String trackingId) {
        if (cargoHashMap.containsKey(trackingId)) {
            return cargoHashMap.get(trackingId);
        }
        return null;
    }

    public Cargo[] findAll() {
        return cargoHashMap.values().toArray(new Cargo[0]);
    }
}
