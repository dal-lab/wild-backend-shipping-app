package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;

public record EndLocation(
        @NotBlank(message = "도착지를 입력해주세요")
        String endLocation
) {

}
