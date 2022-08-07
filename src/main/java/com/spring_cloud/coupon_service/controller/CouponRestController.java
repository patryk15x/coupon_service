package com.spring_cloud.coupon_service.controller;

import com.spring_cloud.coupon_service.model.Coupon;
import com.spring_cloud.coupon_service.repo.CouponRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coupon-api")
@RequiredArgsConstructor
public class CouponRestController {

    private final CouponRepo repo;

    @PostMapping("/coupons")
    public Coupon create(@RequestBody Coupon coupon){
        return repo.save(coupon);
    }

    @GetMapping("/coupons/{code}")
    public Coupon getCouponByCode(@PathVariable String code){
        return repo.findByCode(code);
    }
}
