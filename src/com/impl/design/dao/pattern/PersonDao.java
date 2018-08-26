package com.impl.design.dao.pattern;

import java.util.List;

public interface PersonDao 
{
public void insert(Person person);
public void remove(Person person);
public List<Person> getPeople();

}
