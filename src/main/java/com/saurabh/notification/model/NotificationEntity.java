package com.saurabh.notification.model;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "notifications")
public class NotificationEntity {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "event_id", nullable = false, length = 64)
    private String eventId;

    @Column(name = "sender_id", nullable = false, length = 64)
    private String senderId;

    @Column(name = "receiver_id", nullable = false, length = 64)
    private String receiverId;

    @Column(name = "type", length = 32)
    private String type;

    @Column(name = "priority", length = 32)
    private String priority;

    @Column(name = "message", nullable = false, length = 500)
    private String message;

    @Column(name = "metadata")
    private String metadata;

    @Column(name = "status", nullable = false, length = 16)
    private String status;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    protected NotificationEntity() {
        // JPA
    }

    public NotificationEntity(UUID id,
                              String eventId,
                              String senderId,
                              String receiverId,
                              String type,
                              String priority,
                              String message,
                              String metadata,
                              String status,
                              Instant createdAt) {
        this.id = id;
        this.eventId = eventId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.type = type;
        this.priority = priority;
        this.message = message;
        this.metadata = metadata;
        this.status = status;
        this.createdAt = createdAt;
    }

    // getters & setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
