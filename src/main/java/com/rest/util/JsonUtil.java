package com.rest.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonUtil {
	
	public static String createJson(JSONObject jsObject) {
		
		JSONArray jsonArray= new JSONArray();
		
		jsonArray.add(jsObject);
		
		
	
		
		return jsonArray.toJSONString().indent(4);
		
		
	}

}
