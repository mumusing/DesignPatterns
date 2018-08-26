package com.impl.design.adapter.pattern;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		Vehicle car=new Car();
		car.accelarate();
		Vehicle bus=new Bus();
		bus.accelarate();
		Vehicle bicycle=new  BicycleAdapter(new Bicycle());
		bicycle.accelarate();
	}

}
