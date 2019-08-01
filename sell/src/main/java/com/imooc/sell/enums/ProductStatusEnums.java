package com.imooc.sell.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *  @author: zhaoteng
 *  @Date: 2019\7\28 0028 23:49
 *  @Description: 商品枚举
 */
@Getter
@AllArgsConstructor
public enum ProductStatusEnums {
    UP(0, "正常"),
    DOWN(1, "已下架");

    private Integer code;

    private String message;

}
