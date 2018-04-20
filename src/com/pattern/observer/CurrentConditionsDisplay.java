package com.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");

	}

	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof WeatherData) {
			
			this.weatherData = (WeatherData)o;
			
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			
			display();
		}

	}

}
