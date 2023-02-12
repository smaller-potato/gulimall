package com.tudoupro.gulimall.member.dao;

import com.tudoupro.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author smallerpotato
 * @email tudouxiao9@gmail.com
 * @date 2023-02-12 16:55:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
