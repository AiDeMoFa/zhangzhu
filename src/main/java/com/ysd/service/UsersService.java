package com.ysd.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ysd.entity.Users;

public interface UsersService {
	 /**
	  * 根据条件查询所有用户信息
	  * */
	List<Users> findAllUsers(String LoginName,
			
			String IsLockout,
			Integer page,
			Integer limit
			);
	
	/*
	 * 查询数据条数
	 * **/
	int countAll(String LoginName,
			
			String IsLockout);
	
	/*
	 * 登录验证
	 * **/
	Users logins(String LoginName,String PassWord);
	
	/*
	 * 删除
	 * **/
	int DeleteUser(String Id);
	
	/*
	 * 添加
	 * **/
	int CreateUser(String Id,String LoginName,String PassWord,String ProtectEMail,String ProtectMTel);
	
	/*
	 * 修改
	 * **/
	int UpdateUser(String LoginName,String Id,String ProtectEMail,String ProtectMTel);
	/*
	 * 锁定用户
	 * **/
	int LockUser(String LoginName);
	/*
	 * 解锁用户
	 * **/
	int UnLockUser(String LoginName);
	
	/*
	 * 根据id修改用户的最后登录时间
	 * **/
	int updateTime(String Id,Date LastLoginTime);
}
