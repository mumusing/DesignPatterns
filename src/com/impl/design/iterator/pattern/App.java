package com.impl.design.iterator.pattern;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		NameRepository list=new NameRepository();
		Iterator iterator=list.getIterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
        
	}

}
