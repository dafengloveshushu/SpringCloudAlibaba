package com.chen.mapper;

import com.chen.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 大奉
 * @create 2019-11-16 17:14
 */
public interface UserMapper {

    @Select("select * from user")
    public List<User> queryAll();
}
