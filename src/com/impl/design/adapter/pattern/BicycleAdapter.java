package com.impl.design.adapter.pattern;

public class BicycleAdapter implements Vehicle
{
private Bicycle bicycle;

public BicycleAdapter(Bicycle bicycle) 
{
	// TODO Auto-generated constructor stub
	this.bicycle=bicycle;
}
@Override
public void accelarate() 
{
	// TODO Auto-generated method stub
	this.bicycle.go();
}
}
