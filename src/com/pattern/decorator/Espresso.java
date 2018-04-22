package com.pattern.decorator;

public class Espresso extends Beverage {

	
	public Espresso() {
		
		this.setDescription("Espresso");
	}
	
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
