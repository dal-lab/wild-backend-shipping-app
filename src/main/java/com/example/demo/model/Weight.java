package com.example.demo.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record Weight(
        @Min(1)
        int weight,
        @NotNull(message = "WeightUnit 를 입력해주세요")
        WeightUnit weightUnit
        ) {

}
