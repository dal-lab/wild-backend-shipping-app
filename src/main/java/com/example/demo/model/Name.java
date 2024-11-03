package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;

public record Name(
        @NotBlank(message = "name을 입력해주세요")
        String name
) {

}
