package com.yyc.mybatisdemo.entity;

import lombok.Data;

@Data
public class SysRolePermission {
    private String id;

    private String roleId;

    private String permId;

    private Short deleteFlag;

    public String getId() {
        return id;
    }


}