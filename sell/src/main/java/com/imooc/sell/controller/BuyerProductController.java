package com.imooc.sell.controller;

import com.imooc.sell.dataobject.ProductCategory;
import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.service.impl.ProductCategoryServiceImpl;
import com.imooc.sell.service.impl.ProductInfoServiceImpl;
import com.imooc.sell.utils.ResponseVoUtil;
import com.imooc.sell.vo.ProductInfoVo;
import com.imooc.sell.vo.ProductVo;
import com.imooc.sell.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author:zhaoteng
 * @Description:
 * @Date: 23:24 2019/5/2
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Autowired
    private ProductCategoryServiceImpl productCategoryService;

    @GetMapping("/list")
    public ResponseVo list() {
        //1.查询所有上架商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        //2.查询类目(一次性查询)
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);
        //3.数据封装
        List<ProductVo> productVoList = new ArrayList<ProductVo>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVo productVo = new ProductVo();
            productVo.setCategoryName(productCategory.getCategoryName());
            productVo.setCategoryType(productCategory.getCategoryType());
            List<ProductInfoVo> productInfoVoList = new ArrayList<ProductInfoVo>();
            for (ProductInfo productInfo : productInfoList) {
                ProductInfoVo productInfoVo = new ProductInfoVo();
                BeanUtils.copyProperties(productInfo, productInfoVo);
                productInfoVoList.add(productInfoVo);
            }
            productVo.setProductInfoVoList(productInfoVoList);
            productVoList.add(productVo);
        }
        return ResponseVoUtil.success(productVoList);
    }
}
