package org.example.quickdelivery.presentation.DTO;

import java.util.UUID;

public class CreateDeliveryRequest {
    private UUID orderId;
    private UUID sourceHubID;
    private UUID destHubId;
    private String deliveryAddress;
    private String requestMemo;
    private String receiverName;
    private String receiverSlackId;
}
