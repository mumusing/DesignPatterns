package com.impl.design.iterator.pattern;

public class NameIterator implements Iterator
{
	String[] names;
	int index;
    public NameIterator(String[] names)
    {
		// TODO Auto-generated constructor stub
    	this.names=names;
	}
	@Override
	public boolean hasNext()
	{
		// TODO Auto-generated method stub
		return index<names.length;
	}

	@Override
	public Object next() 
	{
		// TODO Auto-generated method stub
		if (hasNext())
		{
			return names[index++];
		}
		return null;
	}

}
