package com.pattern.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		
		this.setDescription("Dark Roast Coffee");
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .99;
	}

}
