package com.provider.mapper;

import com.common.api.entity.User;

/**
 * Created by zhaojw
 * Date: 2017/10/26
 * Time: 18:29
 *
 * @author: zhaojw
 */
public interface UserMapper {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User selectByPrimaryKey(Long id);

    /**
     * 根据登陆账户查询user
     * @param userName
     * @return
     */
    User selectUserByName(String userName);
}
