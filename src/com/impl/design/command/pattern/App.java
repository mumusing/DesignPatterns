package com.impl.design.command.pattern;

public class App 
{

	public static void main(String[] args)
	{
//	  //Switcher example
//      Switcher switcher=new Switcher();
//      Light light=new Light();
//      switcher.add(new SwitchOffCommand(light));
//      switcher.add(new SwitchOnCommand(light));
//      switcher.executeCommand();
      
		//Producer Consumer Problem
		Algorithum algorithum=new Algorithum();
		
		Thread thread_1=new Thread(new Runnable() 
		{
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				algorithum.produce();
			}
		});
				
	    Thread thread_2=new Thread(new Runnable()
	    {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				algorithum.consume();
			}
		});		
	    thread_1.start();
	    thread_2.start();
	}

}
