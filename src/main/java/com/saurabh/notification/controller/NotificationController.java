package com.saurabh.notification.controller;

import com.saurabh.notification.dto.NotificationRequest;
import com.saurabh.notification.dto.NotificationResponse;
import com.saurabh.notification.service.NotificationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<NotificationResponse> publishNotification(
            @Valid @RequestBody NotificationRequest request) {

        NotificationResponse response = notificationService.publishNotification(request);
        return ResponseEntity.accepted().body(response);
    }
}
