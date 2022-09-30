package com.example.producer.controller;


import com.example.avro.schema.OrderEvent;
import com.example.producer.service.messaging.ProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/order")
public class OrderController {

    private final ProducerService producerService;

    @PostMapping()
    public OrderEvent createFoodOrder(@RequestBody OrderEvent order) {
        log.info("food order request received");
        producerService.sendOrder(order);
        return order;
    }
}
