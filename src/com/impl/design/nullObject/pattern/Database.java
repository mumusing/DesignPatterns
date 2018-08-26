package com.impl.design.nullObject.pattern;

import java.util.ArrayList;
import java.util.List;

public class Database
{
private List<String>customerName;
public Database()
{
	this.customerName=new ArrayList<>();
	this.customerName.add("mukesh");
	this.customerName.add("alok");
	this.customerName.add("ravi");
	this.customerName.add("rudra");	
}

public boolean isExist(String name)
{
	for (String string : customerName) 
	{
		if (string.equals(name)) 
		{
			return true;
		}
	}
	return false;
}
}
