package org.example.quickdelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//Auditing을 활성화 해서 CreatedAt, UpdatedAt가 들어가도록
@EnableJpaAuditing
@SpringBootApplication
public class QuickDeliveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickDeliveryApplication.class, args);
    }
}