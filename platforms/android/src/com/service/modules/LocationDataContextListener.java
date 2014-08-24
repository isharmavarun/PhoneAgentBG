package com.service.modules;

import android.location.Location;
import android.os.Bundle;

public interface LocationDataContextListener {
	
	public void onLocationChanged(Location loc);
	
	public void onProviderDisabled(String provider);
	
	public void onProviderEnabled(String provider);
	
	public void onStatusChanged(String provider, int status, Bundle extras);

}
