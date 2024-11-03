package com.example.demo.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record Length(
        @Min(1)
        int length,
        @NotNull(message = "LengthUnit 를 입력해주세요")
        LengthUnit lengthUnit
) {

}
