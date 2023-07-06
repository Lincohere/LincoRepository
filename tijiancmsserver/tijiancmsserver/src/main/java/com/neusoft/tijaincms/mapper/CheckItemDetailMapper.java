package com.neusoft.tijaincms.mapper;

import com.neusoft.tijaincms.po.CheckItemDetailed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CheckItemDetailMapper {

    @Select("select * from checkItemDetailed where ciId=#{ciId} order by ciId")
    public List<CheckItemDetailed> listCheckItemDetailed(Integer ciId);

}

