package com.idyll.weather;

import com.cmb.foundation.utils.CellphoneUtils;
import com.cmb.foundation.utils.SpUtils;
import com.idyll.observerweather.R;
import com.idyll.weather.globle.OWConstant;
import com.idyll.weather.observer.WeatherStation;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class OWMainActivity extends Activity {

	// 地名
	private String cityName;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ow_main_activity);
		// 第一次启动，检测网络状况,并定位
		if (CellphoneUtils.checkNetWorkAvailable()) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub

				}
			}).start();
		}

		cityName = SpUtils.getValue(OWConstant.SP_NAME, OWConstant.PLACENAME,
				"上海");

		WeatherStation.showCurrentDisplay();
	}

}
