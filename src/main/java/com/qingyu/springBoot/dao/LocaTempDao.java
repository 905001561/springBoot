package com.qingyu.springBoot.dao;

import com.qingyu.springBoot.domain.LocaTemp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LocaTempDao {

    @Select({"select * from loca_temp LIMIT 0,10"})
    List<LocaTemp> findAll();
}
