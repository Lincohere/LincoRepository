package com.neusoft.tijaincms.service.impl;

import com.neusoft.tijaincms.mapper.CiDetailedReportMapper;
import com.neusoft.tijaincms.po.CiDetailedReport;
import com.neusoft.tijaincms.service.CiDetailedReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiDetailedReportServiceImpl implements CiDetailedReportService {
    @Autowired
    private CiDetailedReportMapper ciDetailedReportMapper;
    public int upDateCiDetailedReport(List<CiDetailedReport> list){
        return ciDetailedReportMapper.upDateCiDetailedReport(list);
    }
}
