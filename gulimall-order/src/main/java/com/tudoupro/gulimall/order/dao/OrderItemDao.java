package com.tudoupro.gulimall.order.dao;

import com.tudoupro.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author smallerpotato
 * @email tudouxiao9@gmail.com
 * @date 2023-02-12 17:18:11
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
