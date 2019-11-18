package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 大奉
 * @create 2019-11-18 9:53
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public List<User> queryAll(){
        return userService.queryAll();
    }

    @RequestMapping("/queryUser")
    public User queryUserNameAndPassword(String userName, String password) {
        User user = userService.queryUserNameAndPassword(userName, password);
        if(user != null) {
            return user;
        } else {
            return null;
        }
    }
}
