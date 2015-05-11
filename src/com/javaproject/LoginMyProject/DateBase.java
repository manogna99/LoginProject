package com.javaproject.LoginMyProject;

import java.util.HashMap;
import java.util.Map;

public class DateBase {

	public String getingUserPassword(String us){
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("manogna","manu");
		map.put("madhavi","raghu");
		return map.get(us);
		
		
		
	}
}
