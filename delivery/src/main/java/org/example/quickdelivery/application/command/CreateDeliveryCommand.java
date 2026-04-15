package org.example.quickdelivery.application.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class CreateDeliveryCommand {
    private UUID orderId;
    private UUID sourceHubId;
    private UUID destHubId;
    private String deliveryAddress;
    private String requestMemo;
    private String receiverName;
    private String receiverSlackId;
}
