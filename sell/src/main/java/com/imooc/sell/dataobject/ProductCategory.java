package com.imooc.sell.dataobject;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 *  @author: zhaoteng
 *  @Date: 2019\7\28 0028 22:39
 *  @Description:
 */
@Entity
@Setter
@Getter
@ToString
@DynamicUpdate
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /**
     * 商品分类ID
     */
    private Integer categoryId;

    /**
     * 商品分类名称
     */
    private String categoryName;

    /**
     * 商品分类类型
     */
    private Integer categoryType;

    /**
     * 商品创建时间
     */
    private Date createTime;

    /**
     * 商品修改时间
     */
    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                '}';
    }
}
