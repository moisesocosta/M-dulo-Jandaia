package com.example.demo.domain.car;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record RequestCarDTO(
        @NotBlank
        String model,
        @NotBlank
        String brand,
        @NotBlank
        String category,
        @Min(100000)
        double price
) {
}
