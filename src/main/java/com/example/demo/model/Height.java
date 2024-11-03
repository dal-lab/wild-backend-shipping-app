package com.example.demo.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record Height(
        @Min(1)
        int height,
        @NotNull(message = "HeightUnit 를 입력해주세요")
        HeightUnit heightUnit
) {

}
