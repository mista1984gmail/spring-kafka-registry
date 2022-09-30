package com.example.producer.service.messaging;

import com.example.avro.schema.OrderEvent;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Slf4j
@Service
public class ProducerServiceImpl implements ProducerService{

    @Value("${messaging.topic.order}")
    private String topicSendingFoodOrder;

    @Autowired
    private KafkaTemplate<String, OrderEvent> kafkaTemplate;

    public void sendOrder(OrderEvent order){

        ListenableFuture<SendResult<String, OrderEvent>> future = kafkaTemplate.send(topicSendingFoodOrder, order);

        future.addCallback(new ListenableFutureCallback<SendResult<String, OrderEvent>>() {

            @Override
            public void onSuccess(SendResult<String, OrderEvent> result) {
                log.info("Sent message=[" + order + "] with offset=[" + result.getRecordMetadata().offset() + "]");
            }

            @Override
            public void onFailure(Throwable ex) {
                log.info("Unable to send message=[" + order + "] due to : " + ex.getMessage());
            }
        });
    }
}
