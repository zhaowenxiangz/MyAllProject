package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @Author:zhaoteng
 * @Description: 商品状态
 * @Date: 1:12 2019/5/2
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
