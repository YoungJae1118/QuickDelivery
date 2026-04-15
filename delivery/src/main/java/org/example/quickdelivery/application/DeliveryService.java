package org.example.quickdelivery.application;

import lombok.RequiredArgsConstructor;
import org.example.quickdelivery.application.command.CreateDeliveryCommand;
import org.example.quickdelivery.application.result.CreateDeliveryResult;
import org.example.quickdelivery.domain.Delivery;
import org.example.quickdelivery.infrastrucure.DeliveryRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryService {
    private final DeliveryRepository deliveryRepository;

    public CreateDeliveryResult createDelivery(CreateDeliveryCommand command) {
    Delivery delivery = Delivery.create(
            command.getOrderId(),
            command.getSourceHubId(),
            command.getDestHubId(),
            command.getDeliveryAddress(),
            command.getRequestMemo(),
            command.getReceiverName(),
            command.getReceiverSlackId()
    );

    Delivery savedDelivery  = deliveryRepository.save(delivery);

    return new CreateDeliveryResult(
            savedDelivery.getId(),
            savedDelivery.getReceiverName(),
            savedDelivery.getDeliveryAddress(),
            savedDelivery.getRequestMemo(),
            savedDelivery.getCreatedAt()
    );
    }
}
