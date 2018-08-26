package com.impl.design.template.pattern;

public abstract class Algorithum 
{
public abstract void initialize();
public abstract void sorting();
public abstract void printResult();

public void sort()
{
	initialize();
	sorting();
	printResult();
}
}
