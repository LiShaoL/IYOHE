package com.iyohe.modules.sys.dao;

import com.iyohe.modules.sys.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 * 
 * @author lishaoliang
 * @email 20161125lsl@gmail.com
 * @date 2017-03-23 15:22:07
 */
@Mapper
public interface SysUserTokenDao extends BaseDao<SysUserTokenEntity> {
    
    SysUserTokenEntity queryByUserId(Long userId);

    SysUserTokenEntity queryByToken(String token);
	
}
