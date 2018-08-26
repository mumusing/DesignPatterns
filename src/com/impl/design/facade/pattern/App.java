package com.impl.design.facade.pattern;

public class App {

	
	/*
	 * This pattern provides a unified interface to a set of interfaces in a system
	 * It defines high level interface that makes sub system easier to use 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SortingManager manager=new SortingManager();
        manager.dobubleSort();
	}

}
