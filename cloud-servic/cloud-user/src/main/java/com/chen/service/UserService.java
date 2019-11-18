package com.chen.service;

import com.chen.pojo.User;

import java.util.List;

/**
 * @author 大奉
 * @create 2019-11-18 9:50
 */
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> queryAll();

    /**
     * 根据用户名查询用户信息
     * @param userName
     * @param password
     * @return
     */
    public User queryUserNameAndPassword(String userName, String password);
}
