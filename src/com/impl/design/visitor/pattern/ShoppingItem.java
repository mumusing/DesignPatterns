package com.impl.design.visitor.pattern;

public interface ShoppingItem
{
    public double accept(ShoppingCartVisitor visitor);
	
	
	
}
