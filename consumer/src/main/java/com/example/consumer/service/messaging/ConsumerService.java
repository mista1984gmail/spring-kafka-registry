package com.example.consumer.service.messaging;

import com.example.avro.schema.OrderEvent;
import com.example.consumer.domain.dto.FoodOrderDto;
import com.example.consumer.service.FoodOrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class ConsumerService {
    private final FoodOrderService foodOrderService;

    @KafkaListener(topics = "${messaging.topic.order}",
                    groupId = "${spring.kafka.consumer.group-id}",
                    containerFactory = "kafkaListenerContainerFactory")

    public void listen(@Payload OrderEvent orderEvent, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {

        log.info("Receiving message from Kafka :: order :: {}, from topic: {}",orderEvent, topic);

        FoodOrderDto foodOrder = FoodOrderDto.builder()
                .item(orderEvent.getItem().toString())
                .amount(orderEvent.getAmount())
                .build();

        foodOrderService.createFoodOrder(foodOrder);
    }
}
