package org.example.quickdelivery.application;

import lombok.RequiredArgsConstructor;
import org.example.quickdelivery.application.command.CreateDeliveryCommand;
import org.example.quickdelivery.application.command.CreateDeliveryResult;
import org.example.quickdelivery.infrastrucure.DeliveryRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryService {
    private final DeliveryRepository deliveryRepository;

    public CreateDeliveryResult CreateDelivery(CreateDeliveryCommand command) {

    }
}
