package com.ysd.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.ysd.entity.Modules;
import com.ysd.entity.Roles;

public class Manager {
      public static Map<String, Object> getResultMap(){
    	  Map<String, Object> resultMap=new HashMap<String, Object>();
    	  resultMap.put("message", "");
    	  resultMap.put("remark", "");
    	  resultMap.put("success", false);
    	  return resultMap;
    	  
      }
      public static List<String> getRoleByName(List<Roles> roles){
    	   List<String> roleName=new ArrayList<String>();
    	   String  Name=null;
    	   for(int i=0;i<roles.size();i++) {
    		  Name=roles.get(i).getName();
    		  roleName.add(Name);
    	   }
    	  
    	    return roleName;
      }
      public static List<String> getRoleById(List<Roles> roles){
   	   List<String> roleId=new ArrayList<String>();
   	String  Id=null;
   	   for(int i=0;i<roles.size();i++) {
   		  Id=roles.get(i).getId();

   		
   	   }
   	  roleId.add(Id);
   	    return roleId;
     }
      
      public static List<Object> menuChild(int id,List<Modules> list){ //子集查找遍历
    	  List<Object> lists = new ArrayList<Object>(); 
          for(Modules entry: list){ 
            Map<String,Object> childArray = new LinkedHashMap<String, Object>(); 
            
            if(entry.getParentId()==id ){ 
				/*
				 * System.out.println(id); System.out.println(entry.getName());
				 */
              childArray.put("id", entry.getId()); 
              childArray.put("title", entry.getName());
              childArray.put("href", entry.getPath());
              childArray.put("children", menuChild(entry.getId(),list));
              lists.add(childArray); 
            } 
          } 
        
          return lists;
      }
 
}
