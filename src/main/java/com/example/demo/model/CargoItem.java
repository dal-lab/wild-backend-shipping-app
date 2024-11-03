package com.example.demo.model;

import org.springframework.stereotype.Component;

// Aggregate 의 Entity가 아님
@Component
public class CargoItem {

    private CargoItemId id;
    private Name name;
    private Description description;
    private int quantity;
    private Weight weight;
    private Length length;
    private Height height;
    private StartLocation startLocation;
    private EndLocation endLocation;
    private CurrentLocation currentLocation;
    private Status status;

    public CargoItem() {
    }

    public CargoItem(CargoItemId id, Name name, Description description,
            int quantity, Weight weight, Length length, Height height,
            StartLocation startLocation, EndLocation endLocation,
            CurrentLocation currentLocation, Status status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.currentLocation = currentLocation;
        this.status = status;
    }

    public CargoItemId getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public Description getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public Weight getWeight() {
        return weight;
    }

    public Length getLength() {
        return length;
    }

    public Height getHeight() {
        return height;
    }

    public StartLocation getStartLocation() {
        return startLocation;
    }

    public EndLocation getEndLocation() {
        return endLocation;
    }

    public CurrentLocation getCurrentLocation() {
        return currentLocation;
    }

    public Status getStatus() {
        return status;
    }
}
