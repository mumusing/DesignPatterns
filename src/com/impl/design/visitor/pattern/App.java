package com.impl.design.visitor.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     List<ShoppingItem>items=new ArrayList<>();
     items.add(new Table("Desk", 45));
     items.add(new Table("Chair1", 20));
     items.add(new Table("Chair2", 25));
     items.add(new Table("Chair3", 25));
     
     double sum=0;
     ShoppingCartVisitor shoppingCart=new ShoppingCart();
     
     for (ShoppingItem shoppingItem : items) 
     {
    	 sum=sum+shoppingItem.accept(shoppingCart);
	 }
     System.out.println(sum);
     
	}

}
