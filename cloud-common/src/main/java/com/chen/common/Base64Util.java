package com.chen.common;

import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;

/**
 * @author 大奉
 * Base64工具类
 * @create 2019-11-21 9:22
 */
public class Base64Util {

    private static Logger logger = LoggerFactory.getLogger(Base64Util.class);

    //private static final String charset = "utf-8";

    private static final String charset = "GB2312";


    /**
     * 解密
     * @param data
     * @return
     */
    public static String decode(String data) {
        try {
            if (null == data) {
                return null;
            }
            return new String(Base64.decodeBase64(data.getBytes(charset)),charset);
        }catch (UnsupportedEncodingException e) {
            logger.error(String.format("字符串:%s,解密异常",data));
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 加密
     * @param data
     * @return
     */
    public static String encode(String data) {
        try {
            if (null == data) {
                return null;
            }
            return new String(Base64.encodeBase64(data.getBytes(charset)),charset);
        }catch (UnsupportedEncodingException e) {
            logger.error(String.format("字符串:%s,加密异常",data));
            e.printStackTrace();
        }
        return null;
    }


}
