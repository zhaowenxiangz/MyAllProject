package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:zhaoteng
 * @Description:
 * @Date: 21:27 2019/5/4
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    /**
     * 按照买家openid查询
     * @param buyerOpenId
     * @param pageable
     * @return
     */
    Page<OrderMaster> findByBuyerOpenId(String buyerOpenId, Pageable pageable);


    OrderMaster findOne(String orderId);

}
