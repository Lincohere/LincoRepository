package com.neusoft.tijaincms.mapper;

import com.neusoft.tijaincms.po.OverallResult;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OverallResultMapper {
    @Select("select*from overallResult where orderId=#{orderId} order by orId")
    public List<OverallResult> listOverallResultByOrderId(Integer orderId);
    @Insert("insert into overallResult values(null,#{title},#{content},#{orderId})")
    public int saveOverallResult(OverallResult overallResult);
    @Update("update overallResult set title=#{title},content=#{content} where orId=#{orId}")
    public int updateOverallResult(OverallResult overallResult);
    @Delete("delete from overallResult where orId=#{orId}")
    public int removeOverallResult(Integer orId);
}
