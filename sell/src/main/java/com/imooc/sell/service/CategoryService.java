package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author:zhaoteng
 * @Description:
 * @Date: 0:38 2019/5/2
 */
public interface CategoryService {

   /**
    * 根据商品分类Id查询类目
    * @param categoryId
    * @return
    */
   ProductCategory findOne(Integer categoryId);

   /**
    * 查询所有商品类目
    * @return
    */
   List<ProductCategory> findAll();

   /**
    * 一次性查到 根据商品类目编号列表 所有商品分类列表
    * @param categoryTypeList
    * @return
    */
   List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

   /**
    * 保存商品类目
    * @param productCategory
    * @return
    */
   ProductCategory save(ProductCategory productCategory);


}
