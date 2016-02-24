package com.idyll.weather.observer;

import com.idyll.weather.observer.subject.WeatherData;

public class WeatherStation {

//	public static void main(String[] args) {
//		// first,create a weather object
//		WeatherData weatherData = new WeatherData();
//
//		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(
//				weatherData);
//		weatherData.setMeasurements(21, 65, 30.4f);
//	}
	
	public static void showCurrentDisplay() {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(
				weatherData);
		weatherData.setMeasurements(21, 65, 30.4f);
	}

}
