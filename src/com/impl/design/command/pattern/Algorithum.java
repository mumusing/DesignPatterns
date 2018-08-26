package com.impl.design.command.pattern;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Algorithum
{

	BlockingQueue<Command>commandList;
	public Algorithum()
	{
		// TODO Auto-generated constructor stub
		this.commandList=new ArrayBlockingQueue<>(10);
	}
	
	public void produce()
	{
		try 
		{
			for (int i = 0; i < 10; i++) 
			{
				commandList.put(new TaskSolver(new Task(i)));
			}
		}
		catch (InterruptedException e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void consume()
	{
		try 
		{
			for (int i = 0; i < 10; i++) 
			{
				Thread.sleep(2000);
				commandList.take().execute();
			}
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
}
