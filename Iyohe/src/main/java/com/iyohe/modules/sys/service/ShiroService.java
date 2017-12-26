package com.iyohe.modules.sys.service;

import com.iyohe.modules.sys.entity.SysUserEntity;
import com.iyohe.modules.sys.entity.SysUserTokenEntity;

import java.util.Set;

/**
 * shiro相关接口
 * @author lishaoliang
 * @email 20161125lsl@gmail.com
 * @date 2017-06-06 8:49
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    SysUserTokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     * @param userId
     */
    SysUserEntity queryUser(Long userId);
}
