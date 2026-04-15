package org.example.quickdelivery.application.command;

import java.time.LocalDateTime;
import java.util.UUID;

public class CreateDeliveryResult {
    private UUID deliveryId;
    private String receiverName;
    private String deliveryAddress;
    private String requestMemo;
    private LocalDateTime createdAt;
}
