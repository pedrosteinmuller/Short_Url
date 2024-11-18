package com.pedrostein.ProjectShortUrl;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<Map<String, Object>, Map<String, String>> {
	
	@Override
	public Map<String, String> handleRequest(Map<String, Object> stringObjectMap, Context context){
		return null;
	}
}

