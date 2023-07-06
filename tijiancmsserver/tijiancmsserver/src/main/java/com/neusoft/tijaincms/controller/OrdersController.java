package com.neusoft.tijaincms.controller;

import com.neusoft.tijaincms.dto.OrdersPageRequestDto;
import com.neusoft.tijaincms.dto.OrdersPageResponseDto;
import com.neusoft.tijaincms.po.Orders;
import com.neusoft.tijaincms.service.impl.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersServiceImpl ordersService; // 注入实现类

    @RequestMapping("/listOrders")
    public OrdersPageResponseDto listOrders(@RequestBody OrdersPageRequestDto request) {
        return ordersService.listOrders(request); // 调用实现类的方法
    }

    @RequestMapping("/getOrdersById")
    public Orders getOrdersById(@RequestBody Orders orders) {
        return ordersService.getOrdersById(orders.getOrderId());
    }

    @RequestMapping("/updateOrdersState")
    public int updateOrdersState(@RequestBody Orders orders) {
        return ordersService.updateOrdersState(orders);
    }
}

