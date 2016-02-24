package com.idyll.weather.observer.subject;

import com.idyll.weather.observer.Observer;

/**
 * 主题接口
 * 
 * @author idyll
 * 
 */
public interface Subject {
	/**
	 * 注册观察者
	 * 
	 * @param o
	 */
	public void registerObserver(Observer o);

	/**
	 * 移除观察者
	 * 
	 * @param o
	 */
	public void removeObserver(Observer o);

	/**
	 * 当主题状态改变时，此方法会被调用调用，以通知观察者
	 */
	public void notifyObservers();
}
