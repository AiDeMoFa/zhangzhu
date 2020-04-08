package com.ysd.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Users implements Serializable{
     private String Id;
     private String LoginName;
     private String PassWord;
     private String Islockout;
     @DateTimeFormat(pattern = "yyyy-MM-dd")
     @JsonFormat(pattern = "yyyy-MM-dd")
     private Date LastLoginTime;
     @DateTimeFormat(pattern = "yyyy-MM-dd")
     @JsonFormat(pattern = "yyyy-MM-dd")
     private Integer PsdWrongTime;
     @DateTimeFormat(pattern = "yyyy-MM-dd")
     @JsonFormat(pattern = "yyyy-MM-dd")
     private Date LockTime;
     private String ProtectEMail;
     private String ProtectMTel;
     private Date CreateTime;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getLoginName() {
		return LoginName;
	}
	public void setLoginName(String loginName) {
		LoginName = loginName;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public String getIslockout() {
		return Islockout;
	}
	public void setIslockout(String islockout) {
		Islockout = islockout;
	}
	public Date getLastLoginTime() {
		return LastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		LastLoginTime = lastLoginTime;
	}
	public Integer getPsdWrongTime() {
		return PsdWrongTime;
	}
	public void setPsdWrongTime(Integer psdWrongTime) {
		PsdWrongTime = psdWrongTime;
	}
	public Date getLockTime() {
		return LockTime;
	}
	public void setLockTime(Date lockTime) {
		LockTime = lockTime;
	}
	public String getProtectEMail() {
		return ProtectEMail;
	}
	public void setProtectEMail(String protectEMail) {
		ProtectEMail = protectEMail;
	}
	public String getProtectMTel() {
		return ProtectMTel;
	}
	public void setProtectMTel(String protectMTel) {
		ProtectMTel = protectMTel;
	}
	public Date getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}
	public Users(String id, String loginName, String passWord, String islockout, Date lastLoginTime,
			Integer psdWrongTime, Date lockTime, String protectEMail, String protectMTel, Date createTime) {
		super();
		Id = id;
		LoginName = loginName;
		PassWord = passWord;
		Islockout = islockout;
		LastLoginTime = lastLoginTime;
		PsdWrongTime = psdWrongTime;
		LockTime = lockTime;
		ProtectEMail = protectEMail;
		ProtectMTel = protectMTel;
		CreateTime = createTime;
	}
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return "Users [Id=" + Id + ", LoginName=" + LoginName + ", PassWord=" + PassWord + ", Islockout=" + Islockout
				+ ", LastLoginTime=" + LastLoginTime + ", PsdWrongTime=" + PsdWrongTime + ", LockTime=" + LockTime
				+ ", ProtectEMail=" + ProtectEMail + ", ProtectMTel=" + ProtectMTel + ", CreateTime=" + CreateTime
				+ "]";
	}
	
     
}
