package com.ysd.entity;

import java.io.Serializable;

public class UserRoles implements Serializable{
    private String Id;
    private String UserId;
    private String RoleId;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getRoleId() {
		return RoleId;
	}
	public void setRoleId(String roleId) {
		RoleId = roleId;
	}
	public UserRoles(String id, String userId, String roleId) {
		super();
		Id = id;
		UserId = userId;
		RoleId = roleId;
	}
	public UserRoles() {
		super();
	}
	@Override
	public String toString() {
		return "UserRoles [Id=" + Id + ", UserId=" + UserId + ", RoleId=" + RoleId + "]";
	}
    
}
