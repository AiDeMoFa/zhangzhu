package com.ysd.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ysd.entity.Modules;
import com.ysd.entity.Roles;

public interface RoleService {
	 /*
	   * 根据用户id获取角色集合
	   * **/
		List<Roles> GetRolesByUserId(String UserId);
		
		 /*
		  * 获取角色条数
		  * **/
		 int Count();
		/*
		 * 查询所有角色集合
		 * **/
		List<Roles> GetRolesAll(Integer page,Integer limit);
		
		/*
		 * 分配用户角色
		 * **/
		int AddUserToRole(String Id,String UserId,String RoleId);
	    /*
	     * 移除用户角色
	     * **/
		int RemoveUserFromRole(String UserId,String RoleId);

		/*
		 * 根据角色名查询对应的模块名
		 * **/
		 List<Modules> GetSysRightsJsonLayUI(List<String> roleName);

		List<Roles> GetRolesAlll();
}
