package com.pattern.observer;

import java.util.Observable;

public class WeatherData extends Observable{
	
	private float temperature;
	private float pressure;
	private float humidity;
	
	
	public WeatherData() {}
	
	public void measurementsChanged() {
		
		this.setChanged();
		this.notifyObservers();
		this.clearChanged();
	}
	
	public void setMeasurements(float temperature, float pressure, float humidity) {
		
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		
		this.measurementsChanged();
	}


	public float getTemperature() {
		return temperature;
	}


	public float getPressure() {
		return pressure;
	}


	public float getHumidity() {
		return humidity;
	}

	

}
