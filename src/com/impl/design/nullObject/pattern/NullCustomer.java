package com.impl.design.nullObject.pattern;

public class NullCustomer extends AbstractCustomer
{

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getCustomer() {
		// TODO Auto-generated method stub
		return "There is no customer with this name..........";
	}

}
