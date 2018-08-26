package com.impl.design.iterator.pattern;

public class NameRepository
{
    
	private String[] names= {"Adam","Joe","John","Sarah","jonesan"};
	
	public Iterator getIterator()
	{
		return new NameIterator(names);
	}
	
}
