package com.neusoft.tijaincms.mapper;


import com.neusoft.tijaincms.po.CiDetailedReport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CiDetailedReportMapper {

        public int saveCiDetailedReport(List<CiDetailedReport> list);        // 保存检查报告
        @Select("select*from ciDetailedReport where orderId=#{orderId} and ciId=#{ciId} order by cidrId")
        public List<CiDetailedReport> listCiDetailedReportByOrderIdByCiId(CiDetailedReport ciDetailedReport);

        public int upDateCiDetailedReport(List<CiDetailedReport> list);
}
