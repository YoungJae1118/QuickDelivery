package org.example.quickdelivery.presentation;

import lombok.RequiredArgsConstructor;
import org.example.quickdelivery.application.DeliveryService;
import org.example.quickdelivery.application.command.CreateDeliveryCommand;
import org.example.quickdelivery.application.result.CreateDeliveryResult;
import org.example.quickdelivery.presentation.DTO.CreateDeliveryRequest;
import org.example.quickdelivery.presentation.DTO.CreateDeliveryResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deliveries")
@RequiredArgsConstructor
public class DeliveryController {

    private final DeliveryService deliveryService;

    @PostMapping
    public CreateDeliveryResponse createDelivery(@RequestBody CreateDeliveryRequest request) {
        CreateDeliveryCommand command = new CreateDeliveryCommand(
                request.getOrderId(),
                request.getSourceHubID(),
                request.getDestHubId(),
                request.getDeliveryAddress(),
                request.getRequestMemo(),
                request.getReceiverName(),
                request.getReceiverSlackId()
        );

        CreateDeliveryResult result = deliveryService.createDelivery(command);

        return new CreateDeliveryResponse(
                result.getDeliveryId(),
                result.getReceiverName(),
                result.getDeliveryAddress(),
                result.getRequestMemo(),
                result.getCreatedAt()
        );
    }
}
