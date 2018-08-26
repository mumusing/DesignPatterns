package com.impl.design.dao.pattern;

import java.util.ArrayList;
import java.util.List;

public class DataBase implements PersonDao
{
    private List<Person> persons;
    public DataBase() {
		// TODO Auto-generated constructor stub
    	this.persons=new ArrayList<>();
	}
	@Override
	public void insert(Person person) {
		// TODO Auto-generated method stub
		this.persons.add(person);
	}

	@Override
	public void remove(Person person) {
		// TODO Auto-generated method stub
		this.persons.remove(person);
	}

	@Override
	public List<Person> getPeople() {
		// TODO Auto-generated method stub
		return this.persons;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
