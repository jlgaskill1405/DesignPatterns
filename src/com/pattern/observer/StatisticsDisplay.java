package com.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements DisplayElement, Observer {
	
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData) {
		
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	

	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof WeatherData) {
			
			this.weatherData = (WeatherData)o;
			
			float temp = this.weatherData.getTemperature();
			
			tempSum += temp;
			numReadings++;
			
			if(temp > maxTemp) {
				
				maxTemp = temp;
			}
			
			if(temp < minTemp) {
				
				minTemp = temp;
			}
			
			display();
		}

	}

	@Override
	public void display() {
		
		System.out.printf("Avg/Max/Min temperature = " + (tempSum/numReadings) + "/" + maxTemp + "/" +  minTemp); 

	}

}
