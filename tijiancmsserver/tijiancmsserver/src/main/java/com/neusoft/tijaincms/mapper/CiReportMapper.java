package com.neusoft.tijaincms.mapper;

import com.neusoft.tijaincms.po.CiReport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface CiReportMapper {

    @Select("select count(*) from ciReport where orderId = #{orderId}")
    public int getCiReportByOrderId(Integer orderId);                 // 创建检查报告

    @Autowired
    public int saveCiReport(List<CiReport> list);        // 保存检查报告
    @Select("select*from ciReport where orderId=#{orderId}")
    public List<CiReport> listCiReport(Integer orderId);
}
