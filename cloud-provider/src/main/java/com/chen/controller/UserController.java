package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 大奉
 * @create 2019-11-16 17:15
 */
@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/user/query")
    public List<User> queryAll(){
        return userService.queryAll();
    }

}
