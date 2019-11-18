package com.chen.pojo;

import lombok.Data;

/**
 * @author 大奉
 * @create 2019-11-18 9:22
 */
@Data
public class User {
    /**
     * 主键  id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 数据库
     */
    private String dbSource;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 密码
     */
    private String pwd;

}
