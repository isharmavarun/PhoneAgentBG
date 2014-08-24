package com.service;

import org.json.JSONException;
import org.json.JSONObject;

public class ServiceModuleDataContext {

	private JSONObject finalJSONObject = new JSONObject();
	
	public void setJSON(String dataContextType, JSONObject dataContextTypeJSON) throws JSONException {
		this.finalJSONObject.put(dataContextType,dataContextTypeJSON);
	}
	
	public JSONObject getJSON(){
		return this.finalJSONObject;
	}
	
}
