package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author:zhaoteng
 * @Description: 订单DAO
 * @Date: 21:28 2019/5/4
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    /**
     * 根据订单Id查询订单详情
     * @param orderId 订单Id
     * @return 订单详情
     */
    List<OrderDetail> findByOrderId(String orderId);
}
