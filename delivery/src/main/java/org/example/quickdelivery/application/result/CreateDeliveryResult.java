package org.example.quickdelivery.application.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class CreateDeliveryResult {
    private UUID deliveryId;
    private String receiverName;
    private String deliveryAddress;
    private String requestMemo;
    private LocalDateTime createdAt;
}
