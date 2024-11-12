package com.example.demo.model;

public record CargoId(
        String id
) {
    public CargoId(){
        this(new GenerateId().id());
    }
}
