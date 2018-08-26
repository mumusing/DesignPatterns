package com.impl.design.observer.pattern;

public class App 
{
	 /*
     * Defines a one- to- many dependency->If one object changes state all of it dependents are notified automatically
     * 
     */
	
	
	public static void main(String[] args)
	{
		WeatherStation station=new WeatherStation();
		WeatherObservere observer=new WeatherObservere(station);
		station.setPressure(100);
		station.setHumidity(200);
		station.setTemperatures(300);
	}
	
}
