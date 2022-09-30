package com.example.consumer.domain.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Value
@Builder
public class FoodOrderDto {
    String item;
    Double amount;
}
