package org.example.quickdelivery.presentation.DTO;

import lombok.Getter;

import java.util.UUID;

@Getter
public class CreateDeliveryRequest {
    private UUID orderId;
    private UUID sourceHubID;
    private UUID destHubId;
    private String deliveryAddress;
    private String requestMemo;
    private String receiverName;
    private String receiverSlackId;
}
