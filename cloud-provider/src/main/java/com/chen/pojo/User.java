package com.chen.pojo;

import lombok.Data;

/**
 * @author 大奉
 * @create 2019-11-16 17:12
 */
@Data
public class User {

    private Integer id;

    private String userName;

    private String dbSource;

    private String phone;

    private String email;

    private String pwd;
}
