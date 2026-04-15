package org.example.quickdelivery.infrastrucure;

import jakarta.persistence.Id;
import org.example.quickdelivery.domain.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, UUID> {
}
