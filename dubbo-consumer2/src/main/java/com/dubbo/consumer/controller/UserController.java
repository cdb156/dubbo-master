package com.dubbo.consumer.controller;


import com.common.api.entity.User;
import com.common.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zhaojw
 * Date: 2017/10/30
 * Time: 18:46
 *
 * @author: zhaojw
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/getUserByName")
    public User getUserByName(String userName){
        return userService.selectUserByUserName(userName);
    }
}
