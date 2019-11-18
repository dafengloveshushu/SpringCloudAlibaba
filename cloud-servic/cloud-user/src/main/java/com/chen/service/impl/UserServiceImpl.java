package com.chen.service.impl;

import com.chen.mapper.UserMapper;
import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 大奉
 * @create 2019-11-18 9:51
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }

    @Override
    public User queryUserNameAndPassword(String userName, String password) {
        User user = userMapper.queryUserName(userName);
        if(user != null) {
            if(user.getPwd().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
