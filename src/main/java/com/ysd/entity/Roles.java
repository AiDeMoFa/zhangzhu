package com.ysd.entity;

import java.io.Serializable;

public class Roles implements Serializable{
       private String Id;
       private String Name;
       private Integer IntO;
       private String StringO;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getIntO() {
		return IntO;
	}
	public void setIntO(Integer intO) {
		IntO = intO;
	}
	public String getStringO() {
		return StringO;
	}
	public void setStringO(String stringO) {
		StringO = stringO;
	}
	public Roles(String id, String name, Integer intO, String stringO) {
		super();
		Id = id;
		Name = name;
		IntO = intO;
		StringO = stringO;
	}
	public Roles() {
		super();
	}
	@Override
	public String toString() {
		return "Roles [Id=" + Id + ", Name=" + Name + ", IntO=" + IntO + ", StringO=" + StringO + "]";
	}
       
}
