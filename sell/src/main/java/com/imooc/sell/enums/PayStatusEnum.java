package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @Author:zhaoteng
 * @Description:
 * @Date: 21:18 2019/5/4
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1,"支付成功"),
    QUIT(2,"取消支付")
    ;


    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
