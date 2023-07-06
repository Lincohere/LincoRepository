package com.neusoft.tijaincms.mapper;

import com.neusoft.tijaincms.po.CheckItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CheckItemMapper {
    public CheckItem getCheckItemById(Integer ciId);
}
