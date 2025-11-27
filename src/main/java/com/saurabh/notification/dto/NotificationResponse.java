package com.saurabh.notification.dto;

import java.time.Instant;
import java.util.List;

public class NotificationResponse {

    private String requestId;
    private String status;       // e.g. "ACCEPTED"
    private Instant acceptedAt;
    private String message;
    private String senderId;
    private List<String> receiverIds;

    public NotificationResponse() {
    }

    public NotificationResponse(String requestId,
                                String status,
                                Instant acceptedAt,
                                String message,
                                String senderId,
                                List<String> receiverIds) {
        this.requestId = requestId;
        this.status = status;
        this.acceptedAt = acceptedAt;
        this.message = message;
        this.senderId = senderId;
        this.receiverIds = receiverIds;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getStatus() {
        return status;
    }

    public Instant getAcceptedAt() {
        return acceptedAt;
    }

    public String getMessage() {
        return message;
    }

    public String getSenderId() {
        return senderId;
    }

    public List<String> getReceiverIds() {
        return receiverIds;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAcceptedAt(Instant acceptedAt) {
        this.acceptedAt = acceptedAt;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public void setReceiverIds(List<String> receiverIds) {
        this.receiverIds = receiverIds;
    }
}
