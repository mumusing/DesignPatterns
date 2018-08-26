package com.impl.design.nullObject.pattern;

public class RealCustomer extends AbstractCustomer
{
    private String customerName;
	public RealCustomer(String customerName)
	{
		// TODO Auto-generated constructor stub
		this.customerName=customerName;
	}
	@Override
	public boolean isNull() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public String getCustomer() {
		// TODO Auto-generated method stub
		return this.customerName;
	}

}
