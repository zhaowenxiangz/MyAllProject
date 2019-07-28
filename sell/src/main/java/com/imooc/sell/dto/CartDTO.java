package com.imooc.sell.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author:zhaoteng
 * @Description: 购物车对象
 * @Date: 6:51 2019/6/14
 */
@Setter
@Getter
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
