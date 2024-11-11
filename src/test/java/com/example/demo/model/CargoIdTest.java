package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CargoIdTest {

  @Test
  void createId(){
    CargoId id = new CargoId();
    System.out.println("Generated ID: " + id.id());
    assertNotNull(id.id(), "ID should not be null");
  }
}
