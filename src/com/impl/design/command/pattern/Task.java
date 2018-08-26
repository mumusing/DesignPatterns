package com.impl.design.command.pattern;

public class Task 
{

	private int id;
	public Task(int id) 
	{
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	
	public void solveProblem()
	{
		System.out.println("Solving the problem with ID "+this.id);
	}
}
