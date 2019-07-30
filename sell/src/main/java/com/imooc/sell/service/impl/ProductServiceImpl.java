package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.dto.CartDTO;
import com.imooc.sell.enums.ProductStatusEnums;
import com.imooc.sell.enums.ResultEnum;
import com.imooc.sell.exception.SellException;
import com.imooc.sell.repository.ProductInfoRespository;
import com.imooc.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author: zhaoteng
 * @Date: 2019\7\28 23:59
 * @Description: 商品Service实现类
 */
@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductInfoRespository respository;

    @Override
    public Optional<ProductInfo> findOne(String productId) {
        return respository.findById(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return respository.findByProductStatus(ProductStatusEnums.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return respository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return respository.save(productInfo);
    }

    @Override
    public void increaseStock(List<CartDTO> cartDTOList) {

    }

    @Override
    @Transactional(rollbackFor = SellException.class)
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO : cartDTOList) {
            Optional<ProductInfo> productInfo = respository.findById(cartDTO.getProductId());
            if (null == productInfo) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            Integer result = productInfo.get().getProductStock() - cartDTO.getProductQuantity();
            if (result < 0) {
                throw new SellException(ResultEnum.PRODUCT_STOCK_NOT_ENOUGH);
            } else {
                productInfo.get().setProductStock(result);
            }
            respository.save(productInfo.get());
        }
    }
}
