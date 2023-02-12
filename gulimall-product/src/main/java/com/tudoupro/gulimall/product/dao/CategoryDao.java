package com.tudoupro.gulimall.product.dao;

import com.tudoupro.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author smallerpotato
 * @email tudouxiao9@gmail.com
 * @date 2023-02-11 21:56:06
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
