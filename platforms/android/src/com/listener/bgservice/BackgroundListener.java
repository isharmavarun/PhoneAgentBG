package com.listener.bgservice;

import org.json.JSONObject;

import com.red_folder.phonegap.plugin.backgroundservice.BackgroundService;
import com.service.ServiceModuleDataContext;

public class BackgroundListener extends BackgroundService {

	@Override
	protected JSONObject initialiseLatestResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected JSONObject doWork() {

		ServiceModuleDataContext smdc = new ServiceModuleDataContext();
		
		return smdc.getJSON();

	}

	@Override
	protected JSONObject getConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setConfig(JSONObject config) {
		// TODO Auto-generated method stub
		
	}

}
