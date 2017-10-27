package com.common.api.service;

import com.common.api.entity.User;

/**
 * Created by zhaojw
 * Date: 2017/10/26
 * Time: 18:03
 *
 * @author: zhaojw
 */
public interface UserService {

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User selectUserById(Long id);

    /**
     * 根据姓名查询用户
     * @param userName
     * @return
     */
    User selectUserByUserName(String userName);
}
