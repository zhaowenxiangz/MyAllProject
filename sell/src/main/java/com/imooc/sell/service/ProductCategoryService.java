package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:zhaoteng
 * @Description:
 * @Date: 0:38 2019/5/2
 */
public interface ProductCategoryService {

   ProductCategory findOne(Integer categoryId);

   List<ProductCategory> findAll();

   List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

   ProductCategory save(ProductCategory productCategory);


}
