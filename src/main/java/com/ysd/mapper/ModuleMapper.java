package com.ysd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ysd.entity.Modules;

public interface ModuleMapper {
    /*
     * 根据角色Id查询所有模块
     * **/
	List<Modules> GetModulesByRoleIdLayUI(@Param("roleId")String roleId);
	List<Modules> GetAllModuleLayUI();
	
	/*
	 * 根据id获取模块信息
	 * **/
	Modules GetModuleById(@Param("Id")Integer Id);
	
	/*
	 * 添加模块信息
	 * **/
	int CreateModule(@Param("Name")String Name,@Param("ParentId")Integer ParentId,@Param("path")String path,@Param("Weight")Integer Weight);
    
	/*
	 * 根据id修改父节点
	 * **/
   int UpdateModule(@Param("Id")Integer Id,@Param("ParentId")Integer ParentId);
   
   /*
    * 根据id删除模块信息
    * **/
   int DeleteModule(@Param("Id")Integer Id);
   
   /*
    * 分配模块
    * **/
   int AddUserToModule(@Param("Id")String Id,@Param("RoleId")String RoleId,@Param("ModuleId")Integer ModuleId);
   
   /*
    * 移除模块
    * **/
   int RemoveUserFromModule(@Param("RoleId")String RoleId,@Param("ModuleId")Integer ModuleId);
   
   
}
