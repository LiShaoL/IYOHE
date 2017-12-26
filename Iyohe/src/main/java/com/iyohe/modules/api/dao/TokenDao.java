package com.iyohe.modules.api.dao;

import com.iyohe.modules.api.entity.TokenEntity;
import com.iyohe.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户Token
 * 
 * @author lishaoliang
 * @email 20161125lsl@gmail.com
 * @date 2017-03-23 15:22:07
 */
@Mapper
public interface TokenDao extends BaseDao<TokenEntity> {
    
    TokenEntity queryByUserId(Long userId);

    TokenEntity queryByToken(String token);
	
}
