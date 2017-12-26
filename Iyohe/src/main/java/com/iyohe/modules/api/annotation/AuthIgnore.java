package com.iyohe.modules.api.annotation;

import java.lang.annotation.*;

/**
 * api接口，忽略Token验证
 * @author lishaoliang
 * @email 20161125lsl@gmail.com
 * @date 2017-03-23 15:44
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthIgnore {

}
