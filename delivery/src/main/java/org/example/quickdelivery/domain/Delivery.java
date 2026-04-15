package org.example.quickdelivery.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "deliveries")
public class Delivery {
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
}
