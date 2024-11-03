package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;

public record Description(
        @NotBlank(message = "Description을 입력해주세요")
        String description
) {

}
