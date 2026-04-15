package org.example.quickdelivery.application.command;

import java.util.UUID;

public class CreateDeliveryCommand {
    private UUID orderId;
    private UUID sourceHubID;
    private UUID destHubId;
    private String deliveryAddress;
    private String requestMemo;
    private String receiverName;
    private String receiverSlackId;
}
