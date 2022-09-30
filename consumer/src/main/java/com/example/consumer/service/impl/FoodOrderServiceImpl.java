package com.example.consumer.service.impl;

import com.example.consumer.domain.FoodOrder;
import com.example.consumer.domain.dto.FoodOrderDto;
import com.example.consumer.repository.FoodOrderRepository;
import com.example.consumer.service.FoodOrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FoodOrderServiceImpl implements FoodOrderService {
    private final FoodOrderRepository foodOrderRepository;
    private final ModelMapper modelMapper;
    @Override
    public FoodOrder createFoodOrder(FoodOrderDto foodOrderDto) {
        log.info("Save order :: {}", foodOrderDto);
        FoodOrder foodOrder = modelMapper.map(foodOrderDto, FoodOrder.class);
        return foodOrderRepository.save(foodOrder);
    }

}
