package com.example.product.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponseDto {

    private String message;
    private int Status;
}
