package com.ysd.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ysd.entity.Modules;
import com.ysd.entity.Roles;
import com.ysd.service.ModuleService;
import com.ysd.service.RoleService;
import com.ysd.util.Manager;

@RestController
@RequestMapping("/api")
public class ModuleController {
	  @Resource(name="moduleServiceImpl")
	  private ModuleService moduleService;
	  
	  //根据角色id获取模块信息
	  @GetMapping(value="/GetModulesByRoleIdLayUI")
	  public @ResponseBody List<Object>
	  GetModulesByRoleIdLayUI(String roleId) {
		  List<Object> list = new ArrayList<Object>(); 
	  List<Modules> modules=moduleService.GetModulesByRoleIdLayUI(roleId);
	  for (Modules m: modules) {   
          Map<String,Object> mapArr = new LinkedHashMap<String, Object>(); 
          if(m.getParentId()==0){//判断是否为父极
            mapArr.put("id", m.getId()); 
            mapArr.put("title", m.getName()); 
            mapArr.put("children", Manager.menuChild(m.getId(),modules));  //去子集查找遍历
            list.add(mapArr); 
          } 
        } 
	   System.out.println(list);
	  return list;
	  
	  }
	//获取所有模块信息
	  @GetMapping(value="/GetAllModuleLayUI")
	  public @ResponseBody List<Object>
	  GetRolesByUserIdLayUI(String Id) throws ParseException{
		  List<Object> list = new ArrayList<Object>(); 
	  List<Modules> modules=moduleService.GetAllModuleLayUI();
	  for (Modules m: modules) {   
          Map<String,Object> mapArr = new LinkedHashMap<String, Object>(); 
          if(m.getParentId()==0){//判断是否为父极
            mapArr.put("id", m.getId()); 
            mapArr.put("title", m.getName()); 
            mapArr.put("children", Manager.menuChild(m.getId(),modules));  //去子集查找遍历
            list.add(mapArr); 
          } 
        } 
	   
	  return list;
	  
	  }
	  
	  //递归tree数据
	  @GetMapping(value="/GetAllModuleLayUITree")
	  public  List<Object> getTree() {
	        List<Object> list = new ArrayList<Object>(); 
	        List<Modules> modules=moduleService.GetAllModuleLayUI();
	        System.out.println(modules);
	        for (Modules m: modules) {   
	              Map<String,Object> mapArr = new LinkedHashMap<String, Object>(); 
	              if(m.getParentId()==0){//判断是否为父极
	                mapArr.put("id", m.getId()); 
	                mapArr.put("title", m.getName()); 
	                mapArr.put("children", Manager.menuChild(m.getId(),modules));  //去子集查找遍历
	                list.add(mapArr); 
	              } 
	            } 
	        return list;
	    }
      //根据id获取模块信息
	  @GetMapping(value="/GetModuleById")
	  public @ResponseBody Map<String, Object>
	  GetModuleById(Integer Id) {
	  Map<String, Object> resultMap=Manager.getResultMap();
	  Modules modules=moduleService.GetModuleById(Id);
	  if(modules!=null) {
		  resultMap.put("message", modules);
		   resultMap.put("success", true);
	  }
	   
	  return resultMap;
	  
	  }
	  
	 
	 
	  
	  
	  
	  //创建模块信息
	  @GetMapping(value="/CreateModule")
	  public @ResponseBody Map<String, Object>
	  CreateModule(String Name, Integer ParentId, String path, Integer Weight) {
	  Map<String, Object> resultMap=Manager.getResultMap();
	  int n=moduleService.CreateModule(Name, ParentId, path, Weight);
	  if(n>0) {
		   resultMap.put("message", "");
		   resultMap.put("success", true);
	  }
	   
	  return resultMap;
	  
	  }
	  
	  //根据id修改模块信息
	  @GetMapping(value="/UpdateModule")
	  public @ResponseBody Map<String, Object>
	  UpdateModule(Integer parentId,Integer id) {
	  Map<String, Object> resultMap=Manager.getResultMap();
	  int n=moduleService.UpdateModule(id, parentId);
	  if(n>0) {
		   resultMap.put("message", "");
		   resultMap.put("success", true);
	  }
	   
	  return resultMap;
	  
	  }
	  
	 
	  //根据id删除模块信息
	  @GetMapping(value="/DeleteModule")
	  public @ResponseBody Map<String, Object>
	  DeleteModule(Integer id) {
	  Map<String, Object> resultMap=Manager.getResultMap();
	  int n=moduleService.DeleteModule(id);
	  System.out.println(id);
	  if(n>0) {
		   resultMap.put("message", "");
		   resultMap.put("success", true);
	  }else {
		  resultMap.put("message", "删除不对");
	  }
	   
	  return resultMap;
	  
	  }
	  
	  //分配用户角色
	  @GetMapping(value="AddUserToModule")
	  public @ResponseBody Map<String, Object>
	  AddUserToModule(String RoleId,Integer ModuleId){
		  String Id="";
		  Map<String, Object> resultMap=Manager.getResultMap();
		  int n=moduleService.AddUserToModule(Id,RoleId, ModuleId);
		  if(n>0) {
			  resultMap.put("success", true);
		  }
		  
		   return resultMap;
	  }
	  //移除用户角色
	  @GetMapping(value="RemoveUserFromModule")
	  public @ResponseBody Map<String, Object>
	  RemoveUserFromModule(Integer ModuleId,String RoleId){
		  Map<String, Object> resultMap=Manager.getResultMap();
		  int n=moduleService.RemoveUserFromModule(RoleId, ModuleId);
		  if(n>0) {
			  resultMap.put("success", true);
		  }
		  
		   return resultMap;
	  }
}
