package com.listener.bgservice;

import org.json.JSONObject;

import com.red_folder.phonegap.plugin.backgroundservice.BackgroundService;

public class BackgroundListener extends BackgroundService {

	@Override
	protected JSONObject initialiseLatestResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected JSONObject doWork() {
		// TODO Auto-generated method stub
		/*JSONObject result = new JSONObject();
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String now = df.format(new Date(System.currentTimeMillis()));
		String msg = "Hello world, time now:"+now;
		Log.d("BGService",msg);
		try {
			result.put("Message", msg);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
		What we want from the code:
		1. Accelerometer data (Acceleration in X, Y, Z axes)
		2. GPS data (lat, long, speed, altitude, accuracy)
		3. Compass data
		4. Pressure guage
		5. Device info
		6. 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		return null;
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
