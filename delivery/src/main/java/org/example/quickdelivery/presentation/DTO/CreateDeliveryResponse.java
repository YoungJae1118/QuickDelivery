package org.example.quickdelivery.presentation.DTO;

import java.time.LocalDateTime;
import java.util.UUID;

public class CreateDeliveryResponse {
    private UUID deliveryId;
    private String receiverName;
    private String deliveryAddress;
    private String requestMemo;
    private LocalDateTime createdAt;
}
