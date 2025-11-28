package com.saurabh.notification.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Instant;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NotificationEvent {

    private String eventId;          // UUID
    private String senderId;
    private List<String> receiverIds;
    private String message;
    private String type;
    private String priority;
    private String metadata;
    private Instant createdAt;

    public NotificationEvent() {
    }

    public NotificationEvent(String eventId,
                             String senderId,
                             List<String> receiverIds,
                             String message,
                             String type,
                             String priority,
                             String metadata,
                             Instant createdAt) {
        this.eventId = eventId;
        this.senderId = senderId;
        this.receiverIds = receiverIds;
        this.message = message;
        this.type = type;
        this.priority = priority;
        this.metadata = metadata;
        this.createdAt = createdAt;
    }

    public String getEventId() {
        return eventId;
    }

    public String getSenderId() {
        return senderId;
    }

    public List<String> getReceiverIds() {
        return receiverIds;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }

    public String getPriority() {
        return priority;
    }

    public String getMetadata() {
        return metadata;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public void setReceiverIds(List<String> receiverIds) {
        this.receiverIds = receiverIds;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
