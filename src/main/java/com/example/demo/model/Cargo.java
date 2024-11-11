package com.example.demo.model;

public class Cargo {

  private CargoId cargoId;
  private Detail detail;
  private Height height;
  private Length length;
  private Width width;
  private Weight weight;
  private ShippingInfo shippingInfo;
  private CurrentInfo currentInfo;

  public Cargo(
      CargoId cargoId,
      Detail detail,
      Height height,
      Length length,
      Width width,
      Weight weight,
      ShippingInfo shippingInfo
  ) {
    setCargoId(cargoId);
    setDetail(detail);
    setHeight(height);
    setLength(length);
    setWidth(width);
    setWeight(weight);
    setShippingInfo(shippingInfo);
  }

  // 화물 예약하기

  // 화물의 배송 현황 추적

  // 화물 배송 상태 변경


  private void setCargoId(CargoId cargoId) {
    if (cargoId == null) {
      throw new IllegalArgumentException("no CargoId");
    }
    this.cargoId = cargoId;
  }

  private void setDetail(Detail detail) {
    if (detail == null) {
      throw new IllegalArgumentException("no Detail Info");
    }
    this.detail = detail;
  }

  private void setHeight(Height height) {
    if (height == null) {
      throw new IllegalArgumentException("no Height info");
    }
    this.height = height;
  }

  private void setLength(Length length) {
    if (length == null) {
      throw new IllegalArgumentException("no Length info");
    }
    this.length = length;
  }

  private void setWidth(Width width) {
    if (width == null) {
      throw new IllegalArgumentException("no Width info");
    }
    this.width = width;
  }

  private void setWeight(Weight weight) {
    if (weight == null) {
      throw new IllegalArgumentException("no Weight info");
    }
    this.weight = weight;
  }

  private void setShippingInfo(ShippingInfo shippingInfo) {
    if (shippingInfo == null) {
      throw new IllegalArgumentException("no ShippingInfo info");
    }
    this.shippingInfo = shippingInfo;
  }

  public CargoId getCargoId() {
    return cargoId;
  }

  public Detail getDetail() {
    return detail;
  }

  public Height getHeight() {
    return height;
  }

  public Length getLength() {
    return length;
  }

  public Width getWidth() {
    return width;
  }

  public Weight getWeight() {
    return weight;
  }

  public ShippingInfo getShippingInfo() {
    return shippingInfo;
  }
}
