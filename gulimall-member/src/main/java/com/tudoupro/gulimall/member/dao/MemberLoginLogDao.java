package com.tudoupro.gulimall.member.dao;

import com.tudoupro.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author smallerpotato
 * @email tudouxiao9@gmail.com
 * @date 2023-02-12 16:55:32
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
