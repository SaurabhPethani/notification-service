package com.saurabh.notification.service;

import com.saurabh.notification.dto.NotificationEvent;
import com.saurabh.notification.dto.NotificationRequest;
import com.saurabh.notification.dto.NotificationResponse;
import com.saurabh.notification.messaging.producer.NotificationEventProducer;
import com.saurabh.notification.service.NotificationService;

import java.time.Instant;
import java.util.UUID;

public class NotificationServiceImpl implements NotificationService {

    private final NotificationEventProducer producer;

    public NotificationServiceImpl(NotificationEventProducer producer) {
        this.producer = producer;
    }

    @Override
    public NotificationResponse publishNotification(NotificationRequest request) {
        String eventId = UUID.randomUUID().toString();
        Instant now = Instant.now();

        NotificationEvent event = new NotificationEvent(
                eventId,
                request.getSenderId(),
                request.getReceiverIds(),
                request.getMessage(),
                request.getType(),
                request.getPriority(),
                request.getMetadata(),
                now
        );

        producer.send(event);

        return new NotificationResponse(
                eventId,
                "ACCEPTED",
                now,
                request.getMessage(),
                request.getSenderId(),
                request.getReceiverIds()
        );
    }
}
