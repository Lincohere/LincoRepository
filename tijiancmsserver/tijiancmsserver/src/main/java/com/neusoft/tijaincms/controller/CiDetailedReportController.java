package com.neusoft.tijaincms.controller;

import com.neusoft.tijaincms.mapper.CiDetailedReportMapper;
import com.neusoft.tijaincms.po.CiDetailedReport;
import com.neusoft.tijaincms.po.Orders;
import com.neusoft.tijaincms.service.CiReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciDetailedReport")
public class CiDetailedReportController {
    @Autowired
    private CiDetailedReportMapper ciDetailedReportMapper;
    @RequestMapping("/upDateCiDetailedReport")
    public int  upDateCiDetailedReport(@RequestBody List<CiDetailedReport> list) {
        return ciDetailedReportMapper.upDateCiDetailedReport(list);
    }
}
