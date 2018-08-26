package com.impl.design.observer.pattern;

import java.awt.List;
import java.util.ArrayList;

public class WeatherStation implements Subject
{
	private int pressure;
	private int temperatures;
	private int humidity;
	private java.util.List<Observerer>ObservererList=new ArrayList<>();

	@Override
	public void addObserver(Observerer o)
	{
		// TODO Auto-generated method stub
		this.ObservererList.add(o);
	}
    
	@Override
	public void removeObserver(Observerer o) 
	{
		// TODO Auto-generated method stub
		this.ObservererList.remove(o);
	}

	@Override
	public void notifyAllObservers()
	{
		// TODO Auto-generated method stub
		for (Observerer observerer : ObservererList)
		{
			observerer.update(pressure, temperatures, humidity);
		}
	}

	public void setPressure(int pressure)
	{
		this.pressure = pressure;
		this.notifyAllObservers();
	}

	public void setTemperatures(int temperatures) 
	{
		this.temperatures = temperatures;
		this.notifyAllObservers();
	}

	public void setHumidity(int humidity)
	{
		this.humidity = humidity;
		this.notifyAllObservers();
	}
}
