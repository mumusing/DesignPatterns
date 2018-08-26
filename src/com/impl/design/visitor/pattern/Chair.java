package com.impl.design.visitor.pattern;

public class Chair  implements ShoppingItem
{

	private String type;
    private double price;
	public Chair() 
	{
		// TODO Auto-generated constructor stub
		this.type=type;
		this.price=price;
	}
	@Override
	public double accept(ShoppingCartVisitor visitor)
	{
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
