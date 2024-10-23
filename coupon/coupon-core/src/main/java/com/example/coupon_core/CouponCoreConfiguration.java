package com.example.coupon_core;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // CreatedDate, LastModifiedDate 와 같은 기능을 활성화
@ComponentScan
@EnableAutoConfiguration
public class CouponCoreConfiguration {
}
