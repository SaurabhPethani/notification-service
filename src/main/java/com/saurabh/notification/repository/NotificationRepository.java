package com.saurabh.notification.repository;

import com.saurabh.notification.model.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NotificationRepository extends JpaRepository<NotificationEntity, UUID> {

    // later: findByReceiverIdOrderByCreatedAtDesc(String receiverId)
}
