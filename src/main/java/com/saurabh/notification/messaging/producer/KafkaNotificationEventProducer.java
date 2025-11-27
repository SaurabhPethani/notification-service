package com.saurabh.notification.messaging.producer;

import com.saurabh.notification.dto.NotificationEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaNotificationEventProducer implements NotificationEventProducer {

    private static final String TOPIC = "notifications";

    private final KafkaTemplate<String, NotificationEvent> kafkaTemplate;

    public KafkaNotificationEventProducer(KafkaTemplate<String, NotificationEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void send(NotificationEvent event) {
        kafkaTemplate.send(TOPIC, event.getEventId(), event);
    }
}
