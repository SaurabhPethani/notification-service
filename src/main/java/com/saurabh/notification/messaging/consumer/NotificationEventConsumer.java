package com.saurabh.notification.messaging.consumer;

import com.saurabh.notification.dto.NotificationEvent;
import com.saurabh.notification.model.NotificationEntity;
import com.saurabh.notification.repository.NotificationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class NotificationEventConsumer {

    private static final Logger log = LoggerFactory.getLogger(NotificationEventConsumer.class);

    private final NotificationRepository notificationRepository;

    public NotificationEventConsumer(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @KafkaListener(
            topics = "notifications",
            groupId = "notification-consumers",
            containerFactory = "notificationKafkaListenerContainerFactory"
    )
    public void consume(NotificationEvent event) {
        log.info("Received NotificationEvent: eventId={}, sender={}, receivers={}, message={}",
                event.getEventId(),
                event.getSenderId(),
                event.getReceiverIds(),
                event.getMessage()
        );

        Instant now = event.getCreatedAt() != null ? event.getCreatedAt() : Instant.now();

        List<NotificationEntity> entities = new ArrayList<>();

        for (String receiverId : event.getReceiverIds()) {
            NotificationEntity entity = new NotificationEntity(
                    UUID.randomUUID(),
                    event.getEventId(),
                    event.getSenderId(),
                    receiverId,
                    event.getType(),
                    event.getPriority(),
                    event.getMessage(),
                    event.getMetadata(),
                    "PENDING",  // v1 status
                    now
            );
            entities.add(entity);
        }

        notificationRepository.saveAll(entities);

        log.info("Persisted {} notifications for eventId={}", entities.size(), event.getEventId());
    }
}
