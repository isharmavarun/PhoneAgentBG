package com.service.modules;

import org.apache.cordova.CordovaActivity;

public interface AccelerometerDataContextListener {
	
	public void onDemand(CordovaActivity cordovaActivity);
	
	public void onResume();
	
	public void onPause();
	
}
