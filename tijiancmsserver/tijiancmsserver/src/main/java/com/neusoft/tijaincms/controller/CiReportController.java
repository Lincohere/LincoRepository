package com.neusoft.tijaincms.controller;

import com.neusoft.tijaincms.po.CiReport;
import com.neusoft.tijaincms.po.Orders;
import com.neusoft.tijaincms.service.CiReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/ciReport")
public class CiReportController {
    @Autowired
    private CiReportService ciReportService;
    @RequestMapping("/createCiReportTemplate")
    public int  createCiReportTemplate(@RequestBody Orders orders) {
        return ciReportService.createCiReportTemplate(orders);
    }

    @RequestMapping("listCiReport")
    public List<CiReport> listCiReport(@RequestBody CiReport ciReport) {
        return ciReportService.listCiReport(ciReport.getOrderId());
    }
}
