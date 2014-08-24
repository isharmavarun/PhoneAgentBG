package com.service.modules.providers;

import org.apache.cordova.CordovaActivity;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import com.service.ServiceModuleDataContext;
import com.service.modules.AccelerometerDataContextListener;

public class AccelerometerDataContextProvider extends CordovaActivity implements AccelerometerDataContextListener,SensorEventListener{

	Sensor accelerometer;
	SensorManager sensorManager;
	CordovaActivity cordovaActivity;
	ServiceModuleDataContext dataContext;
	
	@Override
	public void onDemand(CordovaActivity cordovaActivity) {
		this.cordovaActivity = cordovaActivity;
		sensorManager = (SensorManager) cordovaActivity.getActivity().getSystemService(Context.SENSOR_SERVICE);
		accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
	
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
		      try {
				JSONObject accelerometerJSON = getAccelerometer(event);
				dataContext.setJSON("ACCELEROMETER",accelerometerJSON);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
	    super.onResume();
	    // register this class as a listener for the orientation and
	    // accelerometer sensors
		sensorManager.registerListener(this,
				sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
				SensorManager.SENSOR_DELAY_NORMAL);
		
	}

	@Override
	public void onResume() {
	    super.onResume();
	    // register this class as a listener for the orientation and
	    // accelerometer sensors
	    sensorManager.registerListener(this,
	        sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
	        SensorManager.SENSOR_DELAY_NORMAL);
		
	}

	@Override
	public void onPause() {
	    // unregister listener
	    super.onPause();
	    sensorManager.unregisterListener(this);
		
	}

	private JSONObject getAccelerometer(SensorEvent event) throws JSONException{
		float[] values = event.values;
	    
	    JSONObject accelerometerJSON = new JSONObject();
	    accelerometerJSON.put("ACCELEROMETER_X", values[0]);
	    accelerometerJSON.put("ACCELEROMETER_Y", values[1]);
	    accelerometerJSON.put("ACCELEROMETER_Z", values[2]);
	    
	    return accelerometerJSON;
	    }
	

}
