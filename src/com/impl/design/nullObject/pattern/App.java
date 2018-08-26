package com.impl.design.nullObject.pattern;

public class App
{

	public static void main(String[] args)
	{
		CustomerFactory custFact=new CustomerFactory();
        System.out.println(custFact.getCustomer("singh").getCustomer());
	}
	
	
	
}
