package com.yyc.security.service;

import com.yyc.security.pojo.SysRolePermission;
import com.yyc.security.pojo.SysRolePermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRolePermissionService {
    long countByExample(SysRolePermissionExample example);

    int deleteByExample(SysRolePermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    List<SysRolePermission> selectByExample(SysRolePermissionExample example);

    SysRolePermission selectByPrimaryKey(String id);

    int updateByExampleSelective( SysRolePermission record,  SysRolePermissionExample example);

    int updateByExample( SysRolePermission record,  SysRolePermissionExample example);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);
}