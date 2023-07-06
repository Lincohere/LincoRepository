package com.neusoft.tijaincms.service;

import com.neusoft.tijaincms.dto.OrdersPageRequestDto;
import com.neusoft.tijaincms.dto.OrdersPageResponseDto;
import com.neusoft.tijaincms.po.Orders;

public interface OrdersService {
    public  OrdersPageResponseDto listOrders(OrdersPageRequestDto request);

    public Orders getOrdersById(Integer orderId);

    public int updateOrdersState(Orders orders);

}
