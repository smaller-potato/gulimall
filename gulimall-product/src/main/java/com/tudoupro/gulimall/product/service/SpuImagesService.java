package com.tudoupro.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tudoupro.common.utils.PageUtils;
import com.tudoupro.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author smallerpotato
 * @email tudouxiao9@gmail.com
 * @date 2023-02-11 21:56:06
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

