package com.ysd.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ysd.entity.Modules;

public interface ModuleService {
	/*
     * 查询所有模块
     * **/
	List<Modules> GetModulesByRoleIdLayUI(String roleId);
	
	List<Modules> GetAllModuleLayUI();
	/*
	 * 根据id获取模块信息
	 * **/
	Modules GetModuleById(Integer Id);
	
	/*
	 * 添加模块信息
	 * **/
	int CreateModule(String Name,Integer ParentId,String path,Integer Weight);

	
	/*
	 * 根据id修改父节点
	 * **/
   int UpdateModule(Integer Id,Integer ParentId);
   
   /*
    * 根据id删除模块信息
    * **/
   int DeleteModule(Integer Id);
   
   /*
    * 分配模块
    * **/
   int AddUserToModule(String Id,String RoleId,Integer ModuleId);
   
   /*
    * 移除模块
    * **/
   int RemoveUserFromModule(String RoleId,Integer ModuleId);
}
