package com.neusoft.tijaincms.mapper;

import com.neusoft.tijaincms.po.Setmeal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealMapper {
    @Select("select * from setmeal order by smId")
    public List<Setmeal> listSetmeal();
    //这是专门为Mapper中的方法做关联查询
    @Select("select * from setmeal where smId=#{smId}")
    public Setmeal getSetmealByIdByMapper(Integer smId);

    public Setmeal getSetmealById(Integer smId);
}
