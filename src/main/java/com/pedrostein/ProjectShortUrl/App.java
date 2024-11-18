package com.pedrostein.ProjectShortUrl;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App implements RequestHandler<Map<String, Object>, Map<String, String>> {
	
	private final ObjectMapper objectMapper = new ObjectMapper();
	
	@Override
	public Map<String, String> handleRequest(Map<String, Object> input, Context context){
		String body = input.get("body").toString();
		
		Map<String, String> bodyMap;
		try {
			bodyMap = objectMapper.readValue(body, Map.class);
		} catch (Exception exception) {
			throw new RuntimeException("Error parsing JSON body: " + exception.getMessage(), exception);
		}
		
		String originalUrl = bodyMap.get("originalURL");
		String expirationTime = bodyMap.get("expirationTime");
		
		return null;
	}
}

