package com.crm.util;


import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Created by wangfei on 2017/7/2.
 */
public class MyStringUtils {
    public static String getMD5Value(String value){
        try {
            //1 获得jdk提供消息摘要算法工具类
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            //2 加密的结果10进制
            byte[] md5ValueBytes = messageDigest.digest(value.getBytes());
            //3将10进制 转换16进制
            BigInteger bigInteger = new BigInteger(1, md5ValueBytes);
            return bigInteger.toString(16);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
