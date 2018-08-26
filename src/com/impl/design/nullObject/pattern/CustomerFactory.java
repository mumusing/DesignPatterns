package com.impl.design.nullObject.pattern;

public class CustomerFactory 
{
    private Database dataBase;
	public CustomerFactory() 
	{
		// TODO Auto-generated constructor stub
		this.dataBase=new Database();
	}
	
	public AbstractCustomer getCustomer(String name)
	{
		if (checkNames(name)) 
		{
			return new RealCustomer(name);
		}
		return new NullCustomer();
	}

	private boolean checkNames(String name) 
	{
		// TODO Auto-generated method stub
		if (dataBase.isExist(name)) 
		{
			return true;
		}
		
		return false;
	}
}
