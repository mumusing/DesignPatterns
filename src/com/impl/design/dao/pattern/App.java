package com.impl.design.dao.pattern;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase database=new DataBase();
		database.insert(new Person("mukesh", 12, "address"));
		database.insert(new Person("singh", 22, "address 123"));
		database.insert(new Person("mukesh", 23, "address 345"));
		database.insert(new Person("kumar", 33, "address 345 567"));
		
		for (Person string : database.getPeople())
		{
			System.out.println(string);
		}
		
	}

}
