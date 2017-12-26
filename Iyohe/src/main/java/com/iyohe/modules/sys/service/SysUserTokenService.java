package com.iyohe.modules.sys.service;

import com.iyohe.common.utils.R;
import com.iyohe.modules.sys.entity.SysUserTokenEntity;

/**
 * 用户Token
 * 
 * @author lishaoliang
 * @email 20161125lsl@gmail.com
 * @date 2017-03-23 15:22:07
 */
public interface SysUserTokenService {

	SysUserTokenEntity queryByUserId(Long userId);

	SysUserTokenEntity queryByToken(String token);
	
	void save(SysUserTokenEntity token);
	
	void update(SysUserTokenEntity token);

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

}
