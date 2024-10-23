package com.example.coupon_core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "coupon_issues")
public class CouponIssue extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long couponId; // 쿠폰 ID

    @Column(nullable = false)
    private Long userId; // 유저 ID

    @Column(nullable = false)
    @CreatedDate
    private LocalDateTime dateIssued; // 발급 일시

    private LocalDateTime dateUsed; // 사용 일시

}
