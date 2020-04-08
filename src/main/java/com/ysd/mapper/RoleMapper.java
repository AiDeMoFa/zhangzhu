package com.ysd.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ysd.entity.Modules;
import com.ysd.entity.Roles;

public interface RoleMapper {
  /*
   * 根据用户id获取角色集合
   * **/
	List<Roles> GetRolesByUserId(@Param("userId")String UserId);
	/*
	 * 查询所有角色集合
	 * **/
	List<Roles> GetRolesAll(@Param("page")Integer page,@Param("limit")Integer limit);
	
	/*
	 * 分配用户角色
	 * **/
	int AddUserToRole(@Param("Id")String Id,@Param("UserId")String UserId,@Param("RoleId")String RoleId);
    /*
     * 移除用户角色
     * **/
	int RemoveUserFromRole(@Param("UserId")String UserId,@Param("RoleId")String RoleId);
	
	/*
	 * 根据角色名查询对应的模块名
	 * **/
	 List<Modules> GetSysRightsJsonLayUI(List<String> roleNames);
	 
	 /*
	  * 获取角色条数
	  * **/
	 int Count();
	List<Roles> GetRolesAlll();
} 
