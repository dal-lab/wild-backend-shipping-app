package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Status(
        @NotBlank(message = "메세지를 입력해주세요")
        String message,
        @NotNull(message = "Status is required")
        CurrentStatus currentStatus
) {

}
