package com.tudoupro.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tudoupro.common.utils.PageUtils;
import com.tudoupro.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author smallerpotato
 * @email tudouxiao9@gmail.com
 * @date 2023-02-12 17:28:27
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

