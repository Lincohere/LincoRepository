package com.neusoft.tijaincms.service;

import com.neusoft.tijaincms.po.CiReport;
import com.neusoft.tijaincms.po.Orders;

import java.util.List;

public interface CiReportService {
    public int createCiReportTemplate(Orders orders);                 // 创建检查报告
    public List<CiReport> listCiReport(Integer orderId);//根据订单id查询检查报告
}
