package com.chen.mapper;

import com.chen.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 大奉
 * @create 2019-11-18 9:39
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> queryAll();

    /**
     * 根据用户名查询用户信息
     * @param userName
     * @return
     */
    public User queryUserName(String userName);
}
