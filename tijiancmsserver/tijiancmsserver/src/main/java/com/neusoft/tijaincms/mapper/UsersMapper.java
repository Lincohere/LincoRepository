package com.neusoft.tijaincms.mapper;

import com.neusoft.tijaincms.po.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UsersMapper {

    @Select("select * from users where userId=#{userId}")
    public Users getUsersById(String userId);
}
