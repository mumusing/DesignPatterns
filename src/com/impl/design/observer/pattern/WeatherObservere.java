package com.impl.design.observer.pattern;

public class WeatherObservere implements Observerer
{

	private int pressure;
	private int temprature;
	private int humidity;
	private Subject subject;
    public WeatherObservere(Subject subject)
    {
		// TODO Auto-generated constructor stub
    	this.subject=subject;
    	this.subject.addObserver(this);
	}
	
	@Override
	public void update(int pressure, int temprature, int humidity) 
	{
		// TODO Auto-generated method stub
		this.pressure=pressure;
		this.temprature=temprature;
		this.humidity=humidity;	
		
		showData();
		
	}
	private void showData() 
	{
		// TODO Auto-generated method stub
		System.out.println(this.pressure+" : "+this.temprature+" : "+this.humidity);
	}

	
}
