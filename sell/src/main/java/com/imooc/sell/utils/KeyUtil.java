package com.imooc.sell.utils;

import java.util.Random;

/**
 * @Author:zhaoteng
 * @Description:
 * @Date: 6:43 2019/6/14
 */
public class KeyUtil {
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
