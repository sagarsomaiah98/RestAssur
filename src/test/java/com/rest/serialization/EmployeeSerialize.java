package com.rest.serialization;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.rest.util.JsonUtil;
import com.rest.util.MappperUtil;

public class EmployeeSerialize {
	 FileWriter output;
	@Test
	public void jsonCreate() {
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("empName", "John");
		jsonObject.put("eid", "564");
		jsonObject.put("location", "Newyork");
		
		System.out.println(JsonUtil.createJson(jsonObject));
	
		try {
			output = new FileWriter(System.getProperty("user.dir")+"\\src\\test\\java\\com\\rest\\testData\\Employee.json");
			 output.write(JsonUtil.createJson(jsonObject));
			 output.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
