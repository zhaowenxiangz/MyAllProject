package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

/**
 *  @author: zhaoteng
 *  @Date: 2019\7\28 0028 23:18
 *  @Description: 商品接口
 */
public interface ProductService {

    /**
     * 根据商品Id查询商品信息
     * @param productId
     * @return
     */
    Optional<ProductInfo> findOne(String productId);

    /**
     * 查询正常上架的商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有商品列表(分页)
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 保存商品
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
