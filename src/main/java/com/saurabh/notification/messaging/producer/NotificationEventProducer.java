package com.saurabh.notification.messaging.producer;

import com.saurabh.notification.dto.NotificationEvent;

public interface NotificationEventProducer {
    void send(NotificationEvent event);
}
