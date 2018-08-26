package com.impl.design.command.pattern;

public class SwitchOnCommand implements Command
{
	private Light light;
	public SwitchOnCommand(Light light)
	{
		// TODO Auto-generated constructor stub
		this.light=light;
	}
	@Override
	public void execute()
	{
		// TODO Auto-generated method stub
		this.light.switchOn();
	}
	
}
