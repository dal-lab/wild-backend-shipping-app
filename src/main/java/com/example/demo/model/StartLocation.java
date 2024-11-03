package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;

public record StartLocation(
        @NotBlank(message = "출발지를 입력해주세요")
        String startLocation
) {

}
