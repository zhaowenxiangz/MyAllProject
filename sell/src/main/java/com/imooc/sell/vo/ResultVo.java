package com.imooc.sell.vo;

import lombok.Getter;
import lombok.Setter;

/**
 *  @author: zhaoteng
 *  @Date: 2019\7\29 22:59
 *  @Description: http请求返回给最外层对象
 */
@Setter
@Getter
public class ResultVo<T> {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;


}
