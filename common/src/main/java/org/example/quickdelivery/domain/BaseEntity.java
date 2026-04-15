package org.example.quickdelivery.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime createdAt;

    //JPA Auditing에서 수정시간을 마지막 변경 시간으로 보기에 생성시 수정시간도 생성됨 즉 null : X
    @LastModifiedDate
    @Column(nullable = false, updatable = false) //updatable = false는 수정 대상에서 빼는 것
    private LocalDateTime updatedAt;

    @Column
    private LocalDateTime deletedAt;

    public void softDelete() {
        this.deletedAt = LocalDateTime.now();
    }
}