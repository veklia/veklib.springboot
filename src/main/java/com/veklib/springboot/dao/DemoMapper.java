package com.veklib.springboot.dao;

import java.util.List;

import com.veklib.springboot.bean.Demo;

public interface DemoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
    
    List<Demo> selectDemos();
}