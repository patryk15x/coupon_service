package com.spring_cloud.coupon_service.repo;

import com.spring_cloud.coupon_service.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepo extends JpaRepository<Coupon, Long> {
}
