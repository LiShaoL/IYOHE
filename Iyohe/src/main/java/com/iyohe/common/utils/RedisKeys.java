package com.iyohe.common.utils;

/**
 * Redis所有Keys
 *
 * @author lishaoliang
 * @email 20161125lsl@gmail.com
 * @date 2017-07-18 19:51
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
