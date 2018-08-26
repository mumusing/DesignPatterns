package com.impl.design.factory.pattern;

public class App {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Algorithum factoryObject=AlgorithumFactory.createAlgorithum(1);
       factoryObject.solve();
	}

}
