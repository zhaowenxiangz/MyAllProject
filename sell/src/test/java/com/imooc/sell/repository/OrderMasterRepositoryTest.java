package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository orderMasterRepository;
    private final String OPENID = "110110";

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("201905042143");
        orderMaster.setBuyerName("zhaoteng1");
        orderMaster.setBuyerPhone("13193379312");
        orderMaster.setBuyerOpenId(OPENID);
        orderMaster.setBuyerAddress("..1");
        orderMaster.setOrderAmount(new BigDecimal(11));

        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenId() throws Exception {
        PageRequest request = new PageRequest(0,3);
        Page<OrderMaster> result = orderMasterRepository.findByBuyerOpenId(OPENID, request);
        System.out.println(result.getTotalElements());
    }
}