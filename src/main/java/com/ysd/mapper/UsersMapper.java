package com.ysd.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ysd.entity.Users;

public interface UsersMapper { 
	 /**
	  * 根据条件查询所有用户信息
	  * */
	List<Users> getAllUsers(@Param("LoginName")String LoginName,
			@Param("IsLockout")String IsLockout,
			@Param("page")Integer page,
			@Param("limit")Integer limit
			);
	
	/*
	 * 查询数据条数
	 * **/
	int countAll(@Param("LoginName")String LoginName,
			
			@Param("IsLockout")String IsLockout);
	
	/*
	 * 登录验证
	 * **/
	Users login(@Param("LoginName")String LoginName,@Param("PassWord")String PassWord);
	
	/*
	 * 删除
	 * **/
	int DeleteUser(@Param("Id")String Id);
	
	/*
	 * 添加
	 * **/
	int CreateUser(@Param("Id")String Id,@Param("LoginName")String LoginName,@Param("PassWord")String PassWord,@Param("ProtectEMail")String ProtectEMail,@Param("ProtectMTel")String ProtectMTel);
	
	/*
	 * 修改
	 * **/
	int UpdateUser(@Param("LoginName")String LoginName,@Param("Id")String Id,@Param("ProtectEMail")String ProtectEMail,@Param("ProtectMTel")String ProtectMTel);
	/*
	 * 锁定用户
	 * **/
	int LockUser(@Param("LoginName")String LoginName);
	/*
	 * 解锁用户
	 * **/
	int UnLockUser(@Param("LoginName")String LoginName);
	
	/*
	 * 根据id修改用户的最后登录时间
	 * **/
	int updateTime(@Param("Id")String Id,@Param("LastLoginTime")Date LastLoginTime);
	/*
	 * 根据用户id查询对应的权限
	 * **/
	
}
