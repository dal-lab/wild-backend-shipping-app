package com.example.demo.domain.model;

public class Cargo {
    private String id;
    private String name;
    private String description;
    private float weight; // in kilograms
    private int volume; // in cubic meters
    private String startingLocation;
    private String currentLocation;
    private String SpecifiedLocation;
    private CargoStatus status;


    public Cargo(String id, String name, String description, float weight, int volume, String startingLocation, String SpecifiedLocation) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.volume = volume;
        this.startingLocation = startingLocation;
        this.currentLocation = startingLocation;
        this.SpecifiedLocation = SpecifiedLocation;
        this.status = CargoStatus.NOT_RECEIVED;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getWeight() {
        return weight;
    }

    public int getVolume() {
        return volume;
    }

    public String getStartingLocation() {
        return startingLocation;
    }

    public String getDestinationLocation() {
        return SpecifiedLocation;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public CargoStatus getStatus() {
        return status;
    }

    public void setCurrentLocation(String location) {
        if (location != null) {
            this.currentLocation = location;
        }
    }

    public void setStatus(CargoStatus status) {
        if (status != null) {
            this.status = status;
        }

    }

    public void moveTo(String location) {
        this.SpecifiedLocation = location;
    }

    public void done() {
        if (this.currentLocation.equals(this.SpecifiedLocation)) {
            this.status = CargoStatus.DELIVERED;
        } else {
            throw new IllegalStateException("Cargo is not done yet");
        }
    }

    public void book() {
        if (this.status == CargoStatus.NOT_RECEIVED) {
            this.status = CargoStatus.IN_TRANSIT;
        } else {
            throw new IllegalStateException("Cargo is already in transit");
        }
    }

    public void receive() {
        if (this.status == CargoStatus.IN_TRANSIT) {
            this.status = CargoStatus.DELIVERED;
        } else {
            throw new IllegalStateException("Cargo is not in transit");
        }

    }

    public void misdirect() {
        this.status = CargoStatus.MISDIRECTED;
    }
}
