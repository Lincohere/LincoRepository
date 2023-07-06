package com.neusoft.tijaincms.mapper;

import com.neusoft.tijaincms.po.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DoctorMapper {
    @Select("select * from doctor where docCode=#{docCode} and password=#{password}")
    public Doctor getDoctorByCodeByPass(Doctor doctor);
}
