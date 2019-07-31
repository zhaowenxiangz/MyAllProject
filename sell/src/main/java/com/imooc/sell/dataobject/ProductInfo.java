package com.imooc.sell.dataobject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 *  @author: zhaoteng
 *  @Date: 2019\7\28 0028 22:39
 *  @Description: 商品信息
 */
@Entity
@Setter
@Getter
@ToString
public class ProductInfo {

    /**
     * 商品Id
     */
    @Id
    private String productId;

    /**
     * 商品名字
     */
    private String productName;

    /**
     * 商品价格
     */
    private BigDecimal productPrice;

    /**
     * 商品库存
     */
    private Integer productStock;

    /**
     * 商品描述
     */
    private String productDescription;

    /**
     * 商品图标
     */
    private String productIcon;

    /**
     * 商品状态 0 正常 1 已下架
     */
    private Integer productStatus;

    /**
     * 商品分类编号
     */
    private Integer categoryType;

    public ProductInfo() {
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productStock=" + productStock +
                ", productDescription='" + productDescription + '\'' +
                ", productIcon='" + productIcon + '\'' +
                ", productStatus=" + productStatus +
                ", categoryType=" + categoryType +
                '}';
    }
}
