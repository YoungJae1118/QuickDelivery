package org.example.quickdelivery.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "deliveries")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Delivery extends BaseEntity{
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private UUID orderId;

    @Column(nullable = false)
    private UUID sourceHubId;

    @Column(nullable = false)
    private UUID destHubId;

    @Column(nullable = false)
    private String deliveryAddress;

    @Column
    private String requestMemo;

    @Column(nullable = false)
    private DeliveryStatus deliveryStatus;

    @Column(nullable = false)
    private String receiverName;

    @Column(nullable = false)
    private String receiverSlackId;

    public Delivery(UUID orderId, UUID sourceHubId, UUID destHubId, String deliveryAddress, String requestMemo, String receiverName, String receiverSlackId, DeliveryStatus deliveryStatus) {
        this.orderId = orderId;
        this.sourceHubId = sourceHubId;
        this.destHubId = destHubId;
        this.deliveryAddress = deliveryAddress;
        this.requestMemo = requestMemo;
        this.receiverName = receiverName;
        this.receiverSlackId = receiverSlackId;
        this.deliveryStatus = deliveryStatus;
    }

    public static Delivery create(UUID orderId, UUID sourceHubId, UUID destHubId, String deliveryAddress, String requestMemo, String receiverName, String receiverSlackId) {
        return new Delivery(
        orderId,
        sourceHubId,
        destHubId,
        deliveryAddress,
        requestMemo,
        receiverName,
        receiverSlackId,
        DeliveryStatus.WAITING
        );
    }
}
