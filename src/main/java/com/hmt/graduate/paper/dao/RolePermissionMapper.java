package com.hmt.graduate.paper.dao;

import com.hmt.graduate.paper.pojo.RolePermissionKey;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface RolePermissionMapper {
    int deleteByPrimaryKey(RolePermissionKey key);

    int insert(RolePermissionKey record);

    int insertSelective(RolePermissionKey record);

	List<RolePermissionKey> findByRole(int roleId);
}