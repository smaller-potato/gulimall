package com.tudoupro.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tudoupro.common.utils.PageUtils;
import com.tudoupro.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author smallerpotato
 * @email tudouxiao9@gmail.com
 * @date 2023-02-12 16:55:33
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

