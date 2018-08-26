package com.impl.design.facade.pattern;

public class SortingManager 
{
     private Algorithum bubleSort;
     private Algorithum mergeSort;
     private Algorithum quickSort;
     
     public SortingManager() {
		// TODO Auto-generated constructor stub
    	 this.bubleSort=new BubbleSort();
    	 this.mergeSort=new MergeSort();
    	 this.quickSort=new QuickSort();
    	 
	}
   public  void doQuickSort()
   {
	   quickSort.sort();
   }
   public  void doMergeSort()
   {
	   mergeSort.sort();
   }
   public  void dobubleSort()
   {
	   bubleSort.sort();
   }
	
}
