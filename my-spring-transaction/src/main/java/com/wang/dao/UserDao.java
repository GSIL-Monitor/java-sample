package com.wang.dao;

import com.wang.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * All Rights Reserved.
 *
 * @version 1.0  2018/9/6 19:29  by  王帅（wangshuai@cloud-young.com）创建
 */
@Mapper
public interface UserDao {
    boolean addUser(User user);

    User findById(Long id);

    List<User> findAll();

}
