package com.impl.design.strategy.pattern;

public class Manager implements Operations
{
     
	 private Operations operation;
	 public void setStrategy(Operations operation) 
	 {
		 this.operation=operation;
	 }
	@Override
	public int operation(int a, int b) {
		// TODO Auto-generated method stub
		return operation.operation(a, b);
	}
	
	
}
