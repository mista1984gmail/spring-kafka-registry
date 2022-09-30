package com.example.producer.service.messaging;

import com.example.avro.schema.OrderEvent;

public interface ProducerService {

    void sendOrder(OrderEvent order);
}
