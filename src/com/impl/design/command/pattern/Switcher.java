package com.impl.design.command.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Switcher 
{
   private List<Command>commandList;
   public Switcher()
   {
	// TODO Auto-generated constructor stub
	  this. commandList=new ArrayList<>();
   }
	public void add(Command command)
	{
		this.commandList.add(command);
	}
	public void executeCommand()
	{
		for (Command command : commandList)
		{
			command.execute();
		}
	}
	
}
