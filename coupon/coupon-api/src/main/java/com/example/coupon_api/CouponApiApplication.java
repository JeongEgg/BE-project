package com.example.coupon_api;

import com.example.coupon_core.CouponCoreConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(CouponCoreConfiguration.class)
@SpringBootApplication
public class CouponApiApplication {

	public static void main(String[] args) {
		// coupon-core 모듈의 application 설정을 반영함.
		System.setProperty("spring.config.name", "application-core,application-api");
		SpringApplication.run(CouponApiApplication.class, args);
	}

}