package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;

public record CurrentLocation(
        @NotBlank(message = "현재 위치를 입력해주세요")
        String currentLocation
) {

}
