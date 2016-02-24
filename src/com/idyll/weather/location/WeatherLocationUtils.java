package com.idyll.weather.location;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;

import com.amap.api.location.LocationManagerProxy;

public class WeatherLocationUtils {

	private Context context;

	


	/**
	 * 判断GPS是否开启
	 * 
	 * @return
	 */
	private static final boolean isGPSEnabled(Context context) {
		LocationManager mLocationManager = (LocationManager) context
				.getSystemService(Context.LOCATION_SERVICE);
		if (mLocationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
			return true;
		} else {
			return false;
		}
	}

	public static final boolean isLocationEnable(Context context) {
		return isGPSEnabled(context) || isNetLocationEnable(context);
	}

	private static final boolean isNetLocationEnable(Context context) {
		return false;
	}

	/**
	 * 强制帮用户打开GPS
	 * 
	 * @param context
	 */
	public static final void openGPS(Context context) {
		Intent GPSIntent = new Intent();
		GPSIntent.setClassName("com.android.settings",
				"com.android.settings.widget.SettingsAppWidgetProvider");
		GPSIntent.addCategory("android.intent.category.ALTERNATIVE");
		GPSIntent.setData(Uri.parse("custom:3"));
		try {
			PendingIntent.getBroadcast(context, 0, GPSIntent, 0).send();
		} catch (CanceledException e) {
			e.printStackTrace();
		}
	}

}
