package com.ysd.serviceImpl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysd.entity.Users;
import com.ysd.mapper.UsersMapper;
import com.ysd.service.UsersService;
@Service
@Transactional
public class UsersServiceImpl implements UsersService{

	 @Resource(name="usersMapper")
	 private UsersMapper usersMapper;
	public Users logins(String LoginName, String PassWord) {
		// TODO Auto-generated method stub
		return usersMapper.login(LoginName, PassWord);
	}
	public List<Users> findAllUsers(String LoginName ,String IsLockout,
			Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return usersMapper.getAllUsers(LoginName, IsLockout, page, limit);
	}
	public int countAll(String LoginName, String IsLockout) {
		// TODO Auto-generated method stub
		return usersMapper.countAll(LoginName,  IsLockout);
	}
	public int DeleteUser(String Id) {
		// TODO Auto-generated method stub
		return usersMapper.DeleteUser(Id);
	}
	public int CreateUser(String Id,String LoginName, String PassWord, String ProtectEMail, String ProtectMTel) {
		// TODO Auto-generated method stub
		return usersMapper.CreateUser(Id,LoginName, PassWord, ProtectEMail, ProtectMTel);
	}
	public int UpdateUser(String LoginName, String Id, String ProtectEMail, String ProtectMTel) {
		// TODO Auto-generated method stub
		return usersMapper.UpdateUser(LoginName, Id, ProtectEMail, ProtectMTel);
	}
	public int LockUser(String LoginName) {
		// TODO Auto-generated method stub
		return usersMapper.LockUser(LoginName);
	}
	public int UnLockUser(String LoginName) {
		// TODO Auto-generated method stub
		return usersMapper.UnLockUser(LoginName);
	}
	public int updateTime(String Id, Date LastLoginTime) {
		// TODO Auto-generated method stub
		return usersMapper.updateTime(Id, LastLoginTime);
	}
	
	
	
	
          
}
