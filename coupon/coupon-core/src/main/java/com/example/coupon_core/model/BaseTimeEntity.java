package com.example.coupon_core.model;

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
public class BaseTimeEntity {

    @CreatedDate // 엔티티가 처음 저장될 때의 날짜 및 시간을 자동으로 기록
    private LocalDateTime dateCreated;

    @LastModifiedDate // 엔티티가 수정될 때의 날짜 및 시간을 자동으로 기록
    private LocalDateTime dateUpdated;
}
