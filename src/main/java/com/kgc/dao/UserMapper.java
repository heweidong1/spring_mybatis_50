package com.kgc.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from itrip_user")
    public List<Map<Object,Object>> query();
}
