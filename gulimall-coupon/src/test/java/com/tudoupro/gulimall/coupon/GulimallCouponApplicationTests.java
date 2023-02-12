package com.tudoupro.gulimall.coupon;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tudoupro.gulimall.coupon.entity.CouponHistoryEntity;
import com.tudoupro.gulimall.coupon.service.CouponHistoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallCouponApplicationTests {

    @Autowired
     CouponHistoryService couponHistoryService;

    @Test
    public void contextLoads() {
        CouponHistoryEntity couponHistoryEntity = new CouponHistoryEntity();
        couponHistoryEntity.setGetType(1);
        couponHistoryService.save(couponHistoryEntity);
        List<CouponHistoryEntity> couponHistoryEntityList = couponHistoryService.list(new QueryWrapper<>(couponHistoryEntity, "get_type"));
        System.out.println(couponHistoryEntityList);
    }

}
