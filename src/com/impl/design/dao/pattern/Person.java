package com.impl.design.dao.pattern;

public class Person
{
   private String name;
   private int age;
   private String address;
   public Person(String name,int age,String address) 
   {
	// TODO Auto-generated constructor stub
	   this.name=name;
	   this.age=age;
	   this.address=address;
	   
   }
	 @Override
	public String toString()
	 {
			// TODO Auto-generated method stub
			return this.name+" : "+this.age+" : "+this.address;
	 }
	
	
}
