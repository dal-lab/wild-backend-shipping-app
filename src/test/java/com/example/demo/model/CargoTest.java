package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CargoTest {

  private CargoId cargoId;
  private Detail detail;
  private Height height;
  private Length length;
  private Width width;
  private Weight weight;
  private ShippingInfo shippingInfo;
  private Status status;
  private PortCity portCity;
  private CurrentInfo currentInfo;

  @BeforeEach
  void setUp(){
    // 필요한 객체들 준비
    cargoId = new CargoId();
    detail = new Detail("Product A", "Description of Product A");
    height = new Height(100, HeightUnit.CM);
    length = new Length(100, LengthUnit.CM);
    width = new Width(100, WidthUnit.CM);
    weight = new Weight(100, WeightUnit.KG);

    // Sender, Receiver, Address 객체 생성
    Sender sender = new Sender("John Doe", "123-456-7890");
    Receiver receiver = new Receiver("Jane Smith", "098-765-4321");
    Address address = new Address("123 Main St", "M1 1AE", "강남구 땡땡 아파트", "06164");

    shippingInfo = new ShippingInfo(sender, receiver, address);

    // Status와 PortCity 객체 준비
    status = Status.PENDING;
    portCity = PortCity.SHANGHAI;

    // CurrentInfo 객체 생성
    currentInfo = new CurrentInfo(status, portCity);

    // CurrentInfo 객체가 잘 생성되었는지 확인
    assertNotNull(currentInfo, "CurrentInfo should not be null");
    assertEquals(status, currentInfo.status(),
        "Status should be correctly set");
    assertEquals(portCity, currentInfo.portCity(),
        "PortCity should be correctly set");


    // 정보 제대로 찾는거 같지가 않음


    // PortCity의 세부 정보 확인
    assertEquals("Shanghai", portCity.getCityName(),
        "City name should be 'Shanghai'");
    assertEquals("China", portCity.getCountry(),
        "Country should be 'China'");
  }

  @Test
  void testBookCargo() {
    // Cargo 객체 생성
    Cargo cargo = new Cargo(
        cargoId,
        detail,
        height,
        length,
        width,
        weight,
        shippingInfo,
        currentInfo);

    // bookCargo 메서드 호출
    cargo.bookCargo(
        detail,
        height,
        length,
        width,
        weight,
        shippingInfo,
        currentInfo);

    // CargoId, Detail, Height가 제대로 설정되었는지 확인
    assertNotNull(cargo.getCargoId(),
        "CargoId should not be null after bookCargo");
    assertEquals(detail, cargo.getDetail(),
        "Detail should be correctly set");
    assertEquals(height, cargo.getHeight(),
        "Height should be correctly set");
    assertEquals(length, cargo.getLength(),
        "Length should be correctly set");
    assertEquals(width, cargo.getWidth(),
        "Width should be correctly set");
    assertEquals(weight, cargo.getWeight(),
        "Weight should be correctly set");
    assertEquals(shippingInfo, cargo.getShippingInfo(),
        "ShippingInfo should be correctly set");
    assertEquals(currentInfo, cargo.getCurrentInfo(),
        "CurrentInfo should be correctly set");
    assertEquals(Status.PENDING, currentInfo.status(),
        "Current initialInfo should be correctly PENDING");
  }
}
