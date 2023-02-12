package com.tudoupro.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tudoupro.common.utils.PageUtils;
import com.tudoupro.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author smallerpotato
 * @email tudouxiao9@gmail.com
 * @date 2023-02-12 17:28:27
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

