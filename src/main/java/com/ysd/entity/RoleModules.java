package com.ysd.entity;

import java.io.Serializable;

public class RoleModules implements Serializable{
       private String Id;
       private String RoleId;
       private Integer ModuleId;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getRoleId() {
		return RoleId;
	}
	public void setRoleId(String roleId) {
		RoleId = roleId;
	}
	public Integer getModuleId() {
		return ModuleId;
	}
	public void setModuleId(Integer moduleId) {
		ModuleId = moduleId;
	}
	public RoleModules(String id, String roleId, Integer moduleId) {
		super();
		Id = id;
		RoleId = roleId;
		ModuleId = moduleId;
	}
	public RoleModules() {
		super();
	}
	@Override
	public String toString() {
		return "RoleModules [Id=" + Id + ", RoleId=" + RoleId + ", ModuleId=" + ModuleId + "]";
	}
       
}
