package com.iyohe.modules.api.dao;

import com.iyohe.modules.api.entity.UserEntity;
import com.iyohe.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * 
 * @author lishaoliang
 * @email 20161125lsl@gmail.com
 * @date 2017-03-23 15:22:06
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity> {

    UserEntity queryByMobile(String mobile);
}
