package com.impl.design.command.pattern;

public class TaskSolver implements Command
{
    private Task task;
	public TaskSolver(Task task)
	{
		// TODO Auto-generated constructor stub
		this.task=task;
		
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.task.solveProblem();
	}

}
