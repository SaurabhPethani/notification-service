package com.saurabh.notification.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.List;

public class NotificationRequest {

    @NotBlank
    private String senderId;

    @NotEmpty
    private List<String> receiverIds;

    @NotBlank
    @Size(max = 500)
    private String message;

    // optional: type of notification (FOLLOW, LIKE, COMMENT, SYSTEM, etc.)
    private String type;

    // optional: priority (LOW, NORMAL, HIGH)
    private String priority;

    // optional: JSON string or key-value metadata
    private String metadata;

    public NotificationRequest() {
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public List<String> getReceiverIds() {
        return receiverIds;
    }

    public void setReceiverIds(List<String> receiverIds) {
        this.receiverIds = receiverIds;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}
