package com.dcits.dao.mapper;

import com.dcits.pojo.User;

import java.util.List;

/**
 * @Author: huangth tel:13246649002
 * Date: 2020/9/25 16:52
 * @Version:
 * @Description:
 */
public interface UserMapper {

    User findUserById(String id);

    List<User> findAll();

    void deleteById(String id);

    void updateUser(User user);

    void insertUser(User user);

    List<User> findUserMap(String name);

}
