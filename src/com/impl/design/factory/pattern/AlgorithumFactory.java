package com.impl.design.factory.pattern;

public class AlgorithumFactory
{
    private static final int SHORTEST_PATH_ALGORITHUM=0;
    private static final int SPANNING_TREE_ALGORITHUM=1;
	
    public static Algorithum createAlgorithum(int type)
    {
    	
    	switch (type) 
    	{
		case SHORTEST_PATH_ALGORITHUM:
			
			return new ShortestPath();
			
        case SPANNING_TREE_ALGORITHUM:
			
			return new SpanningTree();	

		default:
			return null;
		}
    	
    	
    }
}
