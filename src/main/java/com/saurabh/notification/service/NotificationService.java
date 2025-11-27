package com.saurabh.notification.service;

import com.saurabh.notification.dto.NotificationRequest;
import com.saurabh.notification.dto.NotificationResponse;

public interface NotificationService {

    NotificationResponse publishNotification(NotificationRequest request);
}
