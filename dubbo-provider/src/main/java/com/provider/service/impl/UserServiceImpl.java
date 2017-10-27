package com.provider.service.impl;

import com.common.api.entity.User;
import com.common.api.service.UserService;
import com.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhaojw
 * Date: 2017/10/26
 * Time: 18:32
 *
 * @author: zhaojw
 */
@Service
public class UserServiceImpl implements UserService {

     @Resource
     private UserMapper userMapper;

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    @Override
    public User selectUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据姓名查询用户
     *
     * @param userName
     * @return
     */
    @Override
    public User selectUserByUserName(String userName) {
        return userMapper.selectUserByName(userName);
    }
}
