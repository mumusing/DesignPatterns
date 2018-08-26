package com.impl.design.strategy.pattern;

public class App {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//Strategy design pattern-------Separate Behaviour from implementation
		Manager manager=new Manager();
		manager.setStrategy(new Add());
		int result=manager.operation(12, 20);
		System.out.println(result);
		
	}

}
