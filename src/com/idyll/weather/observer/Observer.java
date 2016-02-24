package com.idyll.weather.observer;

/**
 * 观察者接口
 * 
 * @author idyll
 * 
 */
public interface Observer {
	/**
	 * 当气象观测值发生变化时，主题会把状态值当作参数，传递给观察者，所有的观察者都必须实现此方法，以实现观察者接口
	 * 
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void update(float temperature, float humidity, float pressure);
}
