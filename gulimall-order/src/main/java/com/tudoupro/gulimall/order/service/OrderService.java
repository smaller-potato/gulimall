package com.tudoupro.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tudoupro.common.utils.PageUtils;
import com.tudoupro.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author smallerpotato
 * @email tudouxiao9@gmail.com
 * @date 2023-02-12 17:18:11
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

