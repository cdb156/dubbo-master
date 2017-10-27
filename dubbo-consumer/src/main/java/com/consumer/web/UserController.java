package com.consumer.web;


import com.common.api.entity.User;
import com.common.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zhaojw
 * Date: 2017/10/27
 * Time: 16:42
 *
 * @author: zhaojw
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/getUserById/{id}")
    public User getUser(@PathVariable("id") Long userId){
        return userService.selectUserById(userId);
    }
}
