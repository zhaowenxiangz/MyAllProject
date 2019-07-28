package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;


    @Test
    public void saveTest() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1");
        productInfo.setProductName("兰州拉面");
        productInfo.setProductPrice(new BigDecimal(12.0));
        productInfo.setProductStock(30);
        productInfo.setProductStatus(0);
        productInfo.setProductIcon("http://www.baidu.com");
        productInfo.setCategoryType(2);
        productInfo.setProductDescription("nice");
        ProductInfo result = productRepository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() {

      List<ProductInfo> list = productRepository.findByProductStatus(0);
      Assert.assertNotEquals(0, list.size());
    }
}