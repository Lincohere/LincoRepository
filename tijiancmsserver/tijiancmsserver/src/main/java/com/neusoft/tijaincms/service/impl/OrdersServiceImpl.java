package com.neusoft.tijaincms.service.impl;

import com.neusoft.tijaincms.dto.OrdersPageRequestDto;
import com.neusoft.tijaincms.dto.OrdersPageResponseDto;
import com.neusoft.tijaincms.mapper.OrdersMapper;
import com.neusoft.tijaincms.po.Orders;
import com.neusoft.tijaincms.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public OrdersPageResponseDto listOrders(OrdersPageRequestDto request) {
        OrdersPageResponseDto response = new OrdersPageResponseDto();
        int totalRow = ordersMapper.getOrdersCount(request);
        response.setTotalRow(totalRow);
        if(totalRow==0){
           return response;
        }
        int totalPageNum=0;
        if(totalRow%request.getMaxPageNum()==0){
            totalPageNum=totalRow/request.getMaxPageNum();
        }else{
            totalPageNum=totalRow/request.getMaxPageNum()+1;
        }
        response.setTotalPageNum(totalPageNum);

        int pageNum=request.getPageNum();
        if (pageNum>1) {
            response.setPreNum(pageNum-1);
        }
        if (pageNum<totalPageNum) {
            response.setNextNum(pageNum+1);
        }

        request.setBeginNum((pageNum-1)*request.getMaxPageNum());
        List<Orders> list=ordersMapper.listOrders(request);

        response.setPageNum(pageNum);
        response.setMaxPageNum(request.getMaxPageNum());
        response.setList(list);
        return response;
    }
    @Override
    public Orders getOrdersById(Integer orderId){
        return ordersMapper.getOrdersById(orderId);
    }
    @Override
    public int updateOrdersState(Orders orders){
        return ordersMapper.updateOrdersState(orders);
    }

}
