package com.ysd.entity;

import java.io.Serializable;

public class Modules implements Serializable{
      private Integer Id;
      private String Name;
      private Integer ParentId;
      private String path;
      private Integer Weight;
      private String Ops;
      private Integer IntO;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getParentId() {
		return ParentId;
	}
	public void setParentId(Integer parentId) {
		ParentId = parentId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Integer getWeight() {
		return Weight;
	}
	public void setWeight(Integer weight) {
		Weight = weight;
	}
	public String getOps() {
		return Ops;
	}
	public void setOps(String ops) {
		Ops = ops;
	}
	public Integer getIntO() {
		return IntO;
	}
	public void setIntO(Integer intO) {
		IntO = intO;
	}
	public Modules(Integer id, String name, Integer parentId, String path, Integer weight, String ops, Integer intO) {
		super();
		Id = id;
		Name = name;
		ParentId = parentId;
		this.path = path;
		Weight = weight;
		Ops = ops;
		IntO = intO;
	}
	public Modules() {
		super();
	}
	@Override
	public String toString() {
		return "Modules [Id=" + Id + ", Name=" + Name + ", ParentId=" + ParentId + ", path=" + path + ", Weight="
				+ Weight + ", Ops=" + Ops + ", IntO=" + IntO + "]";
	}
	
}
