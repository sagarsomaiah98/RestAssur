package com.rest.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MappperUtil {
	public static ObjectMapper objectMapper= new ObjectMapper();
		
	public static String  mapper(Object obj) throws JsonProcessingException {	
	
	String value=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		return value;
		
	}
	

	public static void main(String[] args) {
		
	}

}
