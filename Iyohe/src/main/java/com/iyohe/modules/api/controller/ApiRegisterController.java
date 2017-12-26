package com.iyohe.modules.api.controller;


import com.iyohe.common.utils.R;
import com.iyohe.common.validator.Assert;
import com.iyohe.modules.api.annotation.AuthIgnore;
import com.iyohe.modules.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注册
 * @author lishaoliang
 * @email 20161125lsl@gmail.com
 * @date 2017-03-26 17:27
 */
@RestController
@RequestMapping("/api")
public class ApiRegisterController {
    @Autowired
    private UserService userService;

    /**
     * 注册
     */
    @AuthIgnore
    @PostMapping("register")
    public R register(String mobile, String password){
        Assert.isBlank(mobile, "手机号不能为空");
        Assert.isBlank(password, "密码不能为空");

        userService.save(mobile, password);

        return R.ok();
    }
}
