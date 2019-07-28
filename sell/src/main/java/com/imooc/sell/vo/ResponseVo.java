package com.imooc.sell.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author:zhaoteng
 * @Description: 返回给前段的封装对象
 * @Date: 23:35 2019/5/2
 */
@Setter
@Getter
public class ResponseVo<T> {

    private Integer code;

    private String msg;

    private T data;
}
