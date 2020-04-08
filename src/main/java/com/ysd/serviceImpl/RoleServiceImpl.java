package com.ysd.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysd.entity.Modules;
import com.ysd.entity.Roles;
import com.ysd.mapper.RoleMapper;
import com.ysd.mapper.UsersMapper;
import com.ysd.service.RoleService;
@Service
@Transactional
public class RoleServiceImpl implements RoleService{
	 @Resource(name="roleMapper")
	 private RoleMapper roleMapper;
	public List<Roles> GetRolesByUserId(String UserId) {
		// TODO Auto-generated method stub
		return roleMapper.GetRolesByUserId(UserId);
	}
	public List<Roles> GetRolesAll(Integer page,Integer limit) {
		// TODO Auto-generated method stub
		return roleMapper.GetRolesAll(page,limit);
	}
	public int AddUserToRole(String Id, String UserId, String RoleId) {
		// TODO Auto-generated method stub
		return roleMapper.AddUserToRole(Id, UserId, RoleId);
	}
	public int RemoveUserFromRole(String UserId, String RoleId) {
		// TODO Auto-generated method stub
		return roleMapper.RemoveUserFromRole(UserId, RoleId);
	}
	public List<Modules> GetSysRightsJsonLayUI(List<String> roleName) {
		// TODO Auto-generated method stub
		return roleMapper.GetSysRightsJsonLayUI(roleName);
	}
	public int Count() {
		// TODO Auto-generated method stub
		return roleMapper.Count();
	}
	public List<Roles> GetRolesAlll() {
		// TODO Auto-generated method stub
		return roleMapper.GetRolesAlll();
	}

}
