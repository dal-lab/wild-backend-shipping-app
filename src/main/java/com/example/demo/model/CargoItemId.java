package com.example.demo.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public record CargoItemId(
        String id
) {
    public CargoItemId() {
        this(new CargoItemIdGenerator().generateId()); // 새로운 ID 생성
    }
}

class CargoItemIdGenerator {

    public String generateId() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        String dateTime = now.format(formatter);
        String shortUUID = UUID.randomUUID().toString().substring(0, 4);

        return dateTime + shortUUID;
    }
}
