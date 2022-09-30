package com.example.consumer.service;

import com.example.consumer.domain.FoodOrder;
import com.example.consumer.domain.dto.FoodOrderDto;

public interface FoodOrderService {
    FoodOrder createFoodOrder(FoodOrderDto foodOrder);

}
