package com.chen.controller;

import com.chen.api.R;
import com.chen.common.RedisUtil;
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
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/query")
    public R<List<User>> queryAll(){
        return R.data(userService.queryAll());
    }

    @RequestMapping("/queryUser")
    public R<User> queryUserNameAndPassword(String userName, String password) {
        User user = userService.queryUserNameAndPassword(userName, password);
        if(user != null) {
            redisUtil.set("user:"+user.getId(), user.getUserName());
            return R.data(user);
        } else {
            return R.fail("该用户不存在!");
        }
    }
}
