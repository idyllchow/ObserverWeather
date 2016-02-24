package com.idyll.weather.observer.subject;

import java.util.ArrayList;

import com.idyll.weather.observer.Observer;

public class WeatherData implements Subject {

	private ArrayList observers;
	private float temperature; //温度
	private float humidity; //湿度
	private float pressure; //气压
	private float polltionIndex; //污染指数

	public WeatherData() {
		// record observer
		observers = new ArrayList();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i > 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		// 把状态告诉每一个观察者
		for (int i = 0; i < observers.size(); i++) {
			Observer o = (Observer) observers.get(i);
			o.update(temperature, humidity, pressure);
		}
		// for (Observer o : observers) {
		// o.update(temperature, humidity, pressure);
		// }

	}

	/**
	 * 当气象站得到观测值时，通知观察者
	 */
	public void measurementsChanged() {
		notifyObservers();
	}

	/**
	 * 
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
