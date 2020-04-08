package com.ysd.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysd.entity.Modules;
import com.ysd.mapper.ModuleMapper;
import com.ysd.service.ModuleService;
@Service
@Transactional
public class ModuleServiceImpl implements ModuleService{
    @Resource(name="moduleMapper")
    private ModuleMapper moduleMapper;
	
	public List<Modules> GetModulesByRoleIdLayUI(String roleId) {
		// TODO Auto-generated method stub
		return moduleMapper.GetModulesByRoleIdLayUI(roleId);
	}

	public List<Modules> GetAllModuleLayUI() {
		// TODO Auto-generated method stub
		return moduleMapper.GetAllModuleLayUI();
	}

	public Modules GetModuleById(Integer Id) {
		// TODO Auto-generated method stub
		return moduleMapper.GetModuleById(Id);
	}

	public int CreateModule(String Name, Integer ParentId, String path, Integer Weight) {
		// TODO Auto-generated method stub
		return moduleMapper.CreateModule(Name, ParentId, path, Weight);
	}

	public int UpdateModule(Integer Id, Integer ParentId) {
		// TODO Auto-generated method stub
		return moduleMapper.UpdateModule(Id, ParentId);
	}

	public int DeleteModule(Integer Id) {
		// TODO Auto-generated method stub
		return moduleMapper.DeleteModule(Id);
	}

	public int AddUserToModule(String Id,String RoleId, Integer ModuleId) {
		// TODO Auto-generated method stub
		return moduleMapper.AddUserToModule(Id,RoleId, ModuleId);
	}

	public int RemoveUserFromModule(String RoleId, Integer ModuleId) {
		// TODO Auto-generated method stub
		return moduleMapper.RemoveUserFromModule(RoleId, ModuleId);
	}
	
	

}
