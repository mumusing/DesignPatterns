package com.impl.design.command.pattern;

public class SwitchOffCommand implements Command
{
   
	private Light light;
	public SwitchOffCommand(Light light)
	{
		// TODO Auto-generated constructor stub
		this.light=light;
	}
	@Override
	public void execute() 
	{
		// TODO Auto-generated method stub
		this.light.switchOff();
	}
	
}
