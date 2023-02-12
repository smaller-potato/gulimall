package com.tudoupro.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tudoupro.common.utils.PageUtils;
import com.tudoupro.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author smallerpotato
 * @email tudouxiao9@gmail.com
 * @date 2023-02-11 21:56:06
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

