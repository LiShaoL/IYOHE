package com.iyohe.datasources;

import com.iyohe.datasources.annotation.DataSource;
import com.iyohe.modules.api.entity.UserEntity;
import com.iyohe.modules.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试
 * @author lishaoliang
 * @email 20161125lsl@gmail.com
 * @date 2017/9/16 23:10
 */
@Service
public class DataSourceTestService {
    @Autowired
    private UserService userService;

    public UserEntity queryObject(Long userId){
        return userService.queryObject(userId);
    }

    @DataSource(name = DataSourceNames.SECOND)
    public UserEntity queryObject2(Long userId){
        return userService.queryObject(userId);
    }
}
